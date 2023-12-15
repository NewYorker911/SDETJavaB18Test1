package class17;

public class E1MethodOverLoading {

    public static void main(String[] args) {
        Math.add(20,30);
        Math.add(12.3,23.4);
        Math.add(12.3,34.4,34.3);
    }
}

class Math{

    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    static void add(double num1, double num2){
        System.out.println(num1+num2);

    }

    static void add(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);
    }
    static void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, int num2){
        System.out.println(num1+num2);
    }

}


