package class13;

public class Task2 {

    void EvenOrOdd (int num){
        if (num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        Task2 EvOd=new Task2();
        EvOd.EvenOrOdd(45);

    }

}
