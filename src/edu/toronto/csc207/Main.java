package edu.toronto.csc207;

public class Main {

    public static void main(String[] args) {
	    // fake a list of users
        UserList users = new UserList();
        users.add(new User("paul", "password"));
        LoginUseCase useCase = new LoginUseCase(users);
        LoginController controller = new LoginController(useCase);
        CmdLineUI ui = new CmdLineUI();
        ui.runLogin(controller);
    }
}
