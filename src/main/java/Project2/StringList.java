package Project2;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = List.of("Apple", "Banana", "Orange", "Apricot", "Grapes");

        // Filter strings starting with "A" and return in lowercase
        List<String> filteredList = filterAndLowercase(stringList);

        // Print the filtered list
        System.out.println("Filtered and Lowercased List: " + filteredList);
    }

    // Function to filter strings starting with "A" and return in lowercase
    private static List<String> filterAndLowercase(List<String> inputList) {
        List<String> result = new ArrayList<>();

        // Iterate through the list
        for (String s : inputList) {
            // Check if the string starts with "A"
            if (s.startsWith("A")) {
                // Convert to lowercase and add to the result list
                result.add(s.toLowerCase());
            }
        }

        return result;
    }

}
