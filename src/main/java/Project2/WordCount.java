package Project2;

import java.util.Scanner;

public class WordCount {

        public static void main(String[] args) {
            String inputString = "Hello, world!";

            // Count the number of words in the string
            int wordCount = countWords(inputString);

            System.out.println("Number of words in \"" + inputString + "\": " + wordCount);
        }

        // Function to count the number of words in a string
        private static int countWords(String str) {
            // Create a Scanner to tokenize the string
            Scanner scanner = new Scanner(str);

            int count = 0;

            // Iterate through the words using the Scanner
            while (scanner.hasNext()) {
                scanner.next(); // Move to the next word
                count++;
            }

            return count;
        }

}
