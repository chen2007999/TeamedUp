package models;

import play.db.ebean.*;

import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;
import java.util.List;

@Entity
public class Client extends Model{

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
    
    @Column(name = "image")
    public String image;

    public String getName() {
        return name;
    }
    
    public String getImage() {
        return image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public static void updateImage(Client client, String image) {
        if(image.length() > 0){
            client.setImage(image);
            client.update();
        }
    }

    public void setName(String name) {
        this.name = name;
    }


    public  static Finder<String, Client> find = new Finder<String, Client>(String.class, Client.class);

    public  static boolean checkNull(Client client) {
        return client.getEmail() == null || client.getPassword() == null
                || client.getName() == null || client.getPassword2()== null;
    }

    public static boolean checkUserEmail(Client client) {
        return !client.getEmail().equals("") && client.getEmail() != null;
    }
    
    public boolean emailFormat(){
        if(!email.contains("@")) return false;
        else if(!email.substring(email.indexOf("@")).contains(".")) return false;
        return true;
    }

    public static boolean checkEmpty(Client client) {
        return client.getEmail().equals("") || client.getPassword().equals("")
                || client.getName().equals("") || client.getPassword2().equals("");
    }

    // Check whether the password matches the password comfirmation
    public static boolean checkPasswordConsistency(Client client) {
        return client.getPassword().equals(client.getPassword2());
    }

    public static void createUser(Client client) {
        client.setImage("http://tmdup.com/assets/images/default.jpg");
        client.save();
    }

    public static void deleteUser(String login) {
        find.ref(login).delete();
    }

    public static boolean validate(Client client) {
        if (client.getEmail() != null) {
            Client mappedClient = find.byId(client.getEmail());
            if (mappedClient != null) {
                String passwordExpected = mappedClient.getPassword();
                if (client.getPassword().equals(passwordExpected)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean userEmailExists(Client client) {
        return find.byId(client.getEmail()) != null;
    }

    public static boolean userNotInTheTeam(Client client, Team team) {
        List<Team> teams = Team.findTeams(team.getTeamName());
        for(Team teamMember : teams) {
            if(teamMember.getMemberEmail().equals(client.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public static List<Team> getTeams(Client client) {
        return Team.find.where().eq("memberEmail", client.getEmail()).findList();

    }
    
    public static Client findUser(Client client) {
        return find.byId(client.getEmail());
    }
    
    public static Client findUserByEmail(String email) {
        return find.byId(email);
    }
    
    public static String getImageByEmail(String email){
        return find.byId(email).image;
    }

    public static boolean userNotInTheEvent(Client client, Event event) {
        List<Event> events = Event.findEvents(event.getEventName());
        for(Event eventMember : events) {
            if(eventMember.getInvolvedEmail().equals(client.getEmail())) {
                return false;
            }
        }
        return true;
    }


}