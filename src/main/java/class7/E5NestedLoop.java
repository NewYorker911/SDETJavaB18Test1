package class7;

public class E5NestedLoop {
    public static void main(String[] args) {

        for (int i=0;i<5;i++){
            for (int j=i; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}