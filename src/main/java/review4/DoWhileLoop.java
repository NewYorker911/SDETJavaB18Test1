package review4;

public class DoWhileLoop {
    public static void main(String[] args) {

        //While VS DO While - in Do While block of code will be executed at least once even when condition is false
        int n=2;
        do {
            if (n%2==0){
                System.out.println(n+ " ");
                n++;
            }
            //n++;
        }while(n<=10);

    }
}
