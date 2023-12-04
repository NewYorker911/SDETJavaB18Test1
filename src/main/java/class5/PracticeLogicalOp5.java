package class5;

import java.util.Scanner;

public class PracticeLogicalOp5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double quiz, midScore, finalScore, avgMax;
        char grade;
        System.out.println("Please enter quiz score");
        quiz=sc.nextInt();
        System.out.println("Please enter midScore score");
        midScore=sc.nextInt();
        System.out.println("Please enter finalScore score");
        finalScore=sc.nextInt();
        avgMax=(quiz+midScore+finalScore)/3;

        if (avgMax>=90){
            grade='A';
        } else if (avgMax>=70) {
            grade='B';
        } else if (avgMax>=50) {
            grade='C';
        } else{
            grade='F';
        }
        System.out.println(grade);


    }
}
