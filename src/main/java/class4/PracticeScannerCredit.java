package class4;

import java.util.Scanner;

public class PracticeScannerCredit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have a credit card? (yes/no): ");
        String hasCreditCard = scanner.nextLine();

        if (hasCreditCard.equals("yes")) {
            System.out.print("What is the balance on your credit card? ");
            double balance = scanner.nextDouble();

            if (balance > 1000) {
                System.out.println("Your credit card balance is larger than 1000. Please pay it off immediately.");
            } else {
                System.out.println("You can spend more on your credit card.");
            }
        } else if (hasCreditCard.equals("no")) {
            System.out.println("Would you like to apply for a credit card? (yes/no): ");
            String applyForCreditCard = scanner.next();

            if (applyForCreditCard.equals("yes")) {
                System.out.println("Great! You can apply for a credit card online or visit a bank branch.");
            } else {
                System.out.println("Alright, if you change your mind, feel free to apply for a credit card later.");
            }
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }
}
