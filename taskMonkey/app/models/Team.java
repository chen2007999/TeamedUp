package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Id;
import java.lang.String;

@Entity
public class Team extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "teamName")
    public String teamName;

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    @Column(name = "memberEmail")

    public String memberEmail;

    public  static Finder<String, Team> find = new Finder<>(String.class, Team.class);

    public static void deleteUser(String email, String teamName) {
        List<Team> teams = find.where().eq("memberEmail", email).eq("teamName", teamName).findList();
        for(Team team : teams) {
            team.delete();
        }
    }

    public static void createTeam(Team team, User user) {
        team.setMemberEmail(user.getEmail());
        team.save();
    }

    public static void addUser(User user, String teamName) {
        Team newTeam = new Team();
        newTeam.setMemberEmail(user.getEmail());
        newTeam.setTeamName(teamName);
        newTeam.save();
    }

    public static List<Team> findTeams(String teamName) {
        return find.where().eq("teamName", teamName).findList();
    }

    public static boolean teamNameEmpty(Team team) {
        return team.getTeamName().equals("");
    }
    
    public static String color(){
        String[] array = new String[]{"bg-color-orange", "bg-color-purple", "bg-color-green", "bg-color-greenDark",
                                        "bg-color-blue", "bg-color-blueDark", "bg-color-red", "bg-color-yellow", "bg-color-darken",
                                        "bg-color-gray", "bg-color-grayLight" };
        int i = (new Random()).nextInt(array.length);
        return array[i];
    }
    
}