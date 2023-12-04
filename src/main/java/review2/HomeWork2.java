package review2;

public class HomeWork2 {

    public static void main(String[] args) {

        int mortgagePrice=150000;
        double mortgageRate=4.5;

        if (mortgageRate<=4.5) {
            System.out.println("Customer buy a house");

            if (mortgagePrice>100000){
                System.out.println("Buy house. Lets take a loan");
            }else {
                System.out.println("Buy house. Pay cash");
            }
        }else {
            System.out.println("Won't buy a house");
        }
    }

}
