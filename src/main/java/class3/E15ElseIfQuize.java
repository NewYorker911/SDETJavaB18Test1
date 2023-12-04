package class3;

public class E15ElseIfQuize {

    public static void main(String[] args) {
        int age=20;

        if (age<1){
            System.out.println("Baby");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 30) {
            System.out.println("Still young");
        } else if (age < 50) {
            System.out.println("A little old");
        }else{
            System.out.println("Old");
        }
    }
}
