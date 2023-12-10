package class14;

public class Task2 {

        int calculateSum(int[] array) {
            int sum = 0;
            for (int i=0; i<array.length; i++) {
                sum=sum+array[i];
            }
            return sum;
        }



        public static void main(String[] args) {
            // Creating an instance of the class
            Task2 calculator = new Task2();

            // Example array
            int[] exampleArray = {1, 2, 3, 4, 5};

            // Accessing the package-private method
            int sum = calculator.calculateSum(exampleArray);

            // Displaying the result
            System.out.println("Sum of the array elements: " + sum);
        }
}
