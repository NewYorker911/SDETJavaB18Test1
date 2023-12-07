package class13;

public class Task1 {

    void NumbersOfTwo (int a, int b){

        if (a>b){
            System.out.println("Number  "+a +" is biger");
        }else {
            System.out.println("Number "+b+" is biger");
        }
    }

    public static void main(String[] args) {

    Task1 larger=new Task1();
    larger.NumbersOfTwo(34,56);


    }
}
