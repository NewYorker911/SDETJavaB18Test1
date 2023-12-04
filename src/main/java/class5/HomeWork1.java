package class5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        /*Ask user to enter a number and then categorize if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000*/

        Scanner didgit=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= didgit.nextInt();

        if (num>=1&&num<=10){
            System.out.println("This is Small number");
        } else if (num>=11&&num<=100) {
            System.out.println("This is Medium number");
        } else if (num>=101&&num<=1000) {
            System.out.println("This is Large number");
        }else {
            System.out.println("Unknown number");
        }

    }
}
