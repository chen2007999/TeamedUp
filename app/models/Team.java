package models;

import play.db.ebean.*;
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

    public  static Finder<String, Team> find = new Finder<String, Team>(String.class, Team.class);

    public static void deleteUser(String email, String teamName) {
        List<Team> teams = find.where().eq("memberEmail", email).eq("teamName", teamName).findList();
        for(Team team : teams) {
            team.delete();
        }
    }

    public static void createTeam(Team team, Client client) {
        if(findTeams(team.teamName).size() == 0){
            team.setMemberEmail(client.getEmail());
            team.save();    
        }
        
    }

    public static void addUser(Client client, String teamName) {
        Team newTeam = new Team();
        newTeam.setMemberEmail(client.getEmail());
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