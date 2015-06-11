package models;

import play.db.ebean.*;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.List;

@Entity
public class Post extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long postId;

    @Column(name = "postName")
    public String postName;

    public String getTeamName() {
        return teamName;
    }

    @Column(name = "teamName")

    public String teamName;

    @Column(name = "content")
    public String content;

    public String getPostName() {
        return postName;
    }

    public String getContent() {
        return content;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getPostId() {
        return postId;
    }

    public void setInvolvedEmail(String involvedEmail) {
        this.involvedEmail = involvedEmail;
    }

    @Column(name = "involvedEmail")
    public String involvedEmail;

    public String getInvolvedEmail() {
        return involvedEmail;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public static Finder<Long, Post> find = new Finder<Long, Post>(Long.class, Post.class);

    public static void createPost(Post post, Team team, Client client) {
        post.setTeamName(team.getTeamName());
        post.setInvolvedEmail(client.getEmail());
        post.save();
    }

    public static void addPost (Post post, Team team, Client client) {
        if(find.where().eq("involvedEmail", client.getEmail()).findList().size() == 0) {
            Post addingPost = addPostHelper(post, team, client);
            addingPost.setInvolvedEmail(client.getEmail());
            addingPost.save();
        }
    }

    public static Post addPostHelper(Post post, Team team, Client client) {
        Post addingPost = new Post();
        addingPost.setPostName(post.getPostName());
        addingPost.setTeamName(team.getTeamName());
        addingPost.setContent(post.getContent());
        return addingPost;
    }

    public static boolean emptyPost(Post post) {
        return post.getPostName().equals("") || post.getContent().equals("");
    }

    public static List<Post> getPostsWithPostName(String postName) {
        return find.where().eq("postName", postName).findList();
    }

    public static List<Post> getPostsWithTeamName(String teamName) {
        List<Post> posts = find.where().eq("teamName", teamName).findList();
        List<Post> result = new ArrayList<Post>();
        for(Post post : posts) {
            boolean notContains = true;
            for(Post resultPost : result) {
                if(resultPost.getPostName().equals(post.getPostName())) {
                    notContains = false;
                }
            }
            if(notContains) {
                result.add(post);
            }
        }
        return  result;
    }

    public static Post getPostWithPostName(String postName) {
        return find.where().eq("postName", postName).findList().get(0);
    }

    public static Post getPostById(Long postId) {
        return find.byId(postId);
    }
}