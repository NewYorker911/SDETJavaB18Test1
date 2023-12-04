package review3;

import java.util.Scanner;

public class SwitchAndScanner {
    public static void main(String[] args) {

        Scanner food=new Scanner(System.in);


        System.out.println("Please enter where are you from");
        String country=food.nextLine();

        switch (country.toLowerCase()){
            case "india":
                System.out.println("You love biriyani");
                break;
            case "egypt":
                System.out.println("You love Koshary");
                break;
            case "georgia":
                System.out.println("You love Hachapuri");
                break;
            case "moldova":
                System.out.println("You love Mamalyga");
                break;
            case "kazakhstan":
                System.out.println("You love beshparmak");
                break;
            case "usa":
                System.out.println("You love burger and french fries");
                break;
            case "great britain":
                System.out.println("You love Fish and Chips");
                break;
            default:
                System.out.println("Unknown food");
        }


    }
}
