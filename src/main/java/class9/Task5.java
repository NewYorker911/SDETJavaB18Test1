package class9;

public class Task5 {

    /*
    Create a 2D array or integer type where you will store odd and even numbers
    in 3 rows and 4 columns. Developer a program which will identify/print the even numbers only
     */
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Print even numbers from the array
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
