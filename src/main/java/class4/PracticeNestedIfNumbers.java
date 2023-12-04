package class4;

import java.util.Scanner;

public class PracticeNestedIfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num = sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a third number: ");
        int num3 = sc.nextInt();

        if (num > num2) {
            if (num > num3) {
                System.out.println("The greatest number is: " + num);
            }
        }else{
            if (num2>num3){
                System.out.println("The greatest number is: " + num2);

            }else{
                System.out.println("The greatest number is: " + num3);
            }
        }
    }
}
