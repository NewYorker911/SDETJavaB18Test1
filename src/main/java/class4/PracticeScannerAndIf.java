package class4;

import java.util.Scanner;

public class PracticeScannerAndIf {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the amount of loan is needed?");
        int loan=scan.nextInt();
        if (loan<=200000){
            System.out.println("Would lend money");
        }else {
            System.out.println("Reject in loan");
        }
    }
}
