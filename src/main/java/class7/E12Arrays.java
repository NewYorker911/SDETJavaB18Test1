package class7;

public class E12Arrays {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 45, 69, 55, 45, 69, 78, 20};


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]==55){
                System.out.println("Found");
                break;
            }
        }
    }
}
