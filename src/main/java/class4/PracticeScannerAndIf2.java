package class4;

import java.util.Scanner;

public class PracticeScannerAndIf2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");

        int age=scan.nextInt();

        if (age>=18){
            System.out.println("Driver license");
        }else {
            System.out.println("Get 17learner permit");
        }

    }
}
