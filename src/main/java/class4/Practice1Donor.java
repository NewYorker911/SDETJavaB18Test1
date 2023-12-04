package class4;

public class Practice1Donor {

    public static void main(String[] args) {

        int age = 18;
        int weight = 110;

        if (age >= 18) {
            if (weight >= 110) {
                System.out.println("Eligible to donate blood");
            }else{
                System.out.println("You are not eligible for blood donation");
            }
        } else {
            System.out.println("We cannot accept such patient");

        }
    }
}
