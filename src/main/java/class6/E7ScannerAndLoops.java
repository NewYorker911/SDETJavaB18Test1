package class6;

import java.util.Scanner;

public class E7ScannerAndLoops {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter starting point");

        int start=sc.nextInt();

        System.out.println("Please enter the end point");
        int end= sc.nextInt();

        System.out.println("Please enter the step size as well");
        int step= sc.nextInt();

        while (start<=end){
            System.out.println(start);
            start=start+step;
        }

    }
}
