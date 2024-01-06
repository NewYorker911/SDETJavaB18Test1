package Project2;

public class PalindromeOrNot {

    public static void main(String[] args) {
        String inputString = "madam";

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use StringBuilder to reverse the string
        StringBuilder reversedStr = new StringBuilder(cleanStr).reverse();

        // Compare the original and reversed strings
        return cleanStr.contentEquals(reversedStr);
    }

}
