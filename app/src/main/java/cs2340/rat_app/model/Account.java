package cs2340.rat_app.model;

/**
 * Created by Borja Vicinay on 9/24/2017.
 */

public class Account {
    //Credentials
    private String username;
    private String password;

    //User Data
    private String firstName;
    private String lastName;
    private String email;

    public Account(String username, String password, String firstName,
                   String lastName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
}
