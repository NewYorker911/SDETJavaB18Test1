package class5;

import java.util.Scanner;

public class PracticeLogicalOp4 {
    public static void main(String[] args) {

        Scanner month=new Scanner(System.in);
        System.out.println("Please enter your Birthday month");
        String monthOfYear=month.nextLine();
        String season;

        if (monthOfYear.equals("March")||monthOfYear.equals("April")||monthOfYear.equals("May")){
            season="Spring";
        } else if (monthOfYear.equals("June")||monthOfYear.equals("July")||monthOfYear.equals("August")) {
            season="Summer";
        } else if (monthOfYear.equals("September")||monthOfYear.equals("October")||monthOfYear.equals("November")) {
            season="Autumn";
        } else if (monthOfYear.equals("December")||monthOfYear.equals("January")||monthOfYear.equals("February")) {
            season="Winter";

        }else {
            season="Invalid";

        }
        System.out.println("Your were born is season "+season);

    }
}
