package class11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        System.out.println("Confirm your password:");
        String confirmPassword = scanner.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or password cannot be empty.");
        } else if (password.length() < 8) {
            System.out.println("Password is too short. It should be at least 8 characters.");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain the username.");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Password do not match the confirmed password.");
        } else {
            System.out.println("Your username and password have been created.");
        }


    }

}
