package Project2;

public class Vowel {

    public static void main(String[] args) {
        String inputString = "documentation";

        // Count the number of vowels in the string
        int vowelCount = countVowels(inputString);

        System.out.println("Number of vowels in \"" + inputString + "\": " + vowelCount);
    }

    // Function to count the number of vowels in a string
    private static int countVowels(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

}
