package review5;

public class Arrays2D1 {
    public static void main(String[] args) {

        int [] [] numbers={
                {3,4,5,56,6},
                {5,6,7,8,9,0,8,},
                {34,23,45,56,345}

        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
