package class5;

import java.util.Scanner;

public class PracticeLogicalOp1 {
    public static void main(String[] args) {

        Scanner heightInch=new Scanner(System.in);
        System.out.println("Please enter your heights in inches");
        double height=heightInch.nextDouble();
        
        if (height<60){
            System.out.println("Short");
        } else if (height>=60 && height<=72) {
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }

    }
}
