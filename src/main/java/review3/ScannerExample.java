package review3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int num=12;
        System.out.println(num);

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter today's month");

        String month=input.next();
        System.out.println("Please enter today's date");
        int day=input.nextInt();

        System.out.println("Please enter today's year");

        int year=input.nextInt();

        System.out.println("Today is "+month+" "+day+" "+year);

        System.out.println("Are you tired?");

         boolean isTired=input.nextBoolean();
        System.out.println("I am tired"+isTired);
    }
}
