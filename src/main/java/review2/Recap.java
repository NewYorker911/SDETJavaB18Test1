package review2;

public class Recap {

    public static void main(String[] args) {

        //Casting: widening/implicit & narrowing/explicit
        //byte ->short ->int ->long->float->double
        double price=12.99;
        System.out.println(price);

        //narrowing: double>float>>long>int>short>byte
        int num=(int)12.99;
        System.out.println(num);

        double result=12/7;
        System.out.println(result);
    }
}
