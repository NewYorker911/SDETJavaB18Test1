package class5;

import java.util.Scanner;

public class PracticeLogicalOp2 {
    public static void main(String[] args) {


    Scanner day=new Scanner(System.in);
        System.out.println("Please enter number of a day");
    int dayOfWeek=day.nextInt();

        if (dayOfWeek>=1 && dayOfWeek<=5){
            System.out.println("It is a weekday");
        } else if (dayOfWeek>=6&&dayOfWeek<=7) {
            System.out.println("It is a weekend");
        }else {
            System.out.println("Invalid day");
        }


    }

}
