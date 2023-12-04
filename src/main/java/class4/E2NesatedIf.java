package class4;

public class E2NesatedIf {

    public static void main(String[] args) {

        double budget=25000;
        String engineType="Electric";

        if (budget>=50000){

            if (engineType.equals("Electric")){
                System.out.println("I want to buy a Tesla");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy Toyota");
            }else{
                System.out.println("I want to buy a Porshe");
            }
        } else if (budget>=30000) {
            if (engineType.equals("Electric")){
                System.out.println("I want to buy BYD");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy Camry");
            }else{
                System.out.println("Hyunday sonaya");
            }

        } else if (budget>=20000) {
            if (engineType.equals("Electric")){
                System.out.println("nissan leaf");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("Kia");
            } else{
                System.out.println("Honda Civic");
            }

        }else{
            System.out.println("Lets save more");
        }

    }

}
