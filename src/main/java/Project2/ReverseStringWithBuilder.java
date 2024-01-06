package Project2;

public class ReverseStringWithBuilder {

    public static void main(String[] args) {
        String inputString = "Hello";
        String reversedString = reverseString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    // Function to reverse a string using StringBuilder
    private static String reverseString(String str) {
        // Create a StringBuilder object with the input string
        StringBuilder stringBuilder = new StringBuilder(str);

        // Use reverse method of StringBuilder to reverse the string
        stringBuilder.reverse();

        // Convert StringBuilder back to a string
        return stringBuilder.toString();
    }
}

