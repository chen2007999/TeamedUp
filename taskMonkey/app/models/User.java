package models;

import com.avaje.ebean.bean.EntityBeanIntercept;
import play.db.ebean.Model;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.Queue;

@Entity
public class User extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String email;

    public String getEmail() {
        return email;
    }

    @Column(name = "password")
    public String password;

    public String getPassword() {
        return password;
    }

    @Column(name = "password2")
    public String password2;

    public String getPassword2() {
        return password2;
    }

    public void setPasswords(String password) {
        password = password;
        password2 = password;
    }

    @Column(name = "name")
    public String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  static Finder<String, User> find = new Finder<>(String.class, User.class);

    public  static boolean checkNull(User user) {
        return user.getEmail() == null || user.getPassword() == null
                || user.getName() == null || user.getPassword2()== null;
    }

    public static boolean checkUserEmail(User user) {
        return !user.getEmail().equals("") && user.getEmail() != null;
    }

    public static boolean checkEmpty(User user) {
        return user.getEmail().equals("") || user.getPassword().equals("")
                || user.getName().equals("") || user.getPassword2().equals("");
    }

    // Check whether the password matches the password comfirmation
    public static boolean checkPasswordConsistency(User user) {
        return user.getPassword().equals(user.getPassword2());
    }

    public static void createUser(User user) {
        user.save();
    }

    public static void deleteUser(String login) {
        find.ref(login).delete();
    }

    public static boolean validate(User user) {
        if (user.getEmail() != null) {
            User mappedUser = find.byId(user.getEmail());
            if (mappedUser != null) {
                String passwordExpected = mappedUser.getPassword();
                if (user.getPassword().equals(passwordExpected)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean userEmailExists(User user) {
        return find.byId(user.getEmail()) != null;
    }

    public static boolean userNotInTheTeam(User user, Team team) {
        List<Team> teams = Team.findTeams(team.getTeamName());
        for(Team teamMember : teams) {
            if(teamMember.getMemberEmail().equals(user.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public static List<Team> getTeams(User user) {
        return Team.find.where().eq("memberEmail", user.getEmail()).findList();

    }

    public static User findUser(User user) {
        return find.byId(user.getEmail());
    }

}