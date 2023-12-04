package review2;

public class NestedIf {

    public static void main(String[] args) {
        //Nested If statement it is statement inside another IF

        boolean allergy=true;
        String allergyType="fish";

        if (allergy) {
            System.out.println("Lets check what kind of allergy you have");

            if (allergyType.equals("peanut")) { // Nested IF
                    System.out.println("Please avoid food that contains peanuts");
            } else if (allergyType.equals("diary")) {
                    System.out.println("Please avoid food with dairy products");
            } else if (allergyType.equals("pollen")) {
                    System.out.println("Please stay indoor when trees are blooming");
            }
        }
    }
}
