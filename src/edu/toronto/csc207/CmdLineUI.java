package edu.toronto.csc207;

import java.util.Scanner;

public class CmdLineUI {
    public void runLogin(LoginController controller) {
        System.out.println("Username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        controller.run(username, password);
    }
}
