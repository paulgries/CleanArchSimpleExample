package edu.toronto.csc207;

public class LoginController {
    //contains an instance of LoginInputBoundary
    private final LoginInputBoundary loginInputBoundary;

    public LoginController(LoginInputBoundary loginInputBoundary) {
        this.loginInputBoundary = loginInputBoundary;
    }

    public void run(String username, String password) {
        //hands off the work to the use case class.
        LoginUseCase.LoginResult rslt = loginInputBoundary.logIn(username, password);
        //does something with the result...
        switch (rslt) {
            case SUCCESS:
                System.out.println("Success!");
                break;
            case FAILURE:
                System.out.println("Failed to login!");
                break;
        }
    }
}
