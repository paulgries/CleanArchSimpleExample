package edu.toronto.csc207;

public class LoginController {
    private final LoginInputBoundary loginInputBoundary;

    public LoginController(LoginInputBoundary loginInputBoundary) {
        this.loginInputBoundary = loginInputBoundary;
    }
    public void run(String username, String password) {
        loginInputBoundary.logIn(username, password);
    }
}
