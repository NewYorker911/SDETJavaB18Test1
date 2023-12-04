package review4;

public class ForLoop {
    public static void main(String[] args) {

        for (int i=10;i>=2;i++){
            System.out.print(i+", ");
        }
        for (int i=10;i<2;i--){      //no execution condition is false
            System.out.print(i+", ");
        }
    }
}
