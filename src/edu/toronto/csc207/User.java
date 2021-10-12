package edu.toronto.csc207;

/**
 * A user with a username and password.
 *
 * IMPORTANT: We are ignoring password encryption in this example.
 * Take a security course for this, likc CSC367.
 */
public class User {

    private final String username;
    /**
     * The password.
     */
    private String password;

    /**
     * A new user with username and password. We are completely ignoring
     * password encryption in this example.
     *
     * @param username the username
     * @param password the password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean passwordMatches(String password) {
        return this.password.equals(password);
    }

    /**
     * The username.
     */
    public String getUsername() {
        return username;
    }
}
