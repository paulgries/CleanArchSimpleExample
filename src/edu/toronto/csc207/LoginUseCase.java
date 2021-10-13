package edu.toronto.csc207;

public class LoginUseCase implements LoginInputBoundary {

    private final UserList users;

    //clearly defining what the "output" of the use case can be
    public enum LoginResult {
        SUCCESS, FAILURE // Should we do NO_SUCH_USER as well as SUCCESS and FAILURE?
    }

    public LoginUseCase(UserList users) {
        this.users = users;
    }

    //this method is the logic of the use case
    public LoginResult logIn(String username, String password) {
        User user = users.getUser(username);
        if (user.passwordMatches(password)) {
            return LoginResult.SUCCESS;
        } else {
            return LoginResult.FAILURE;
        }
    }
}