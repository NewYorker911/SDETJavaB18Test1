package Project2;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Function to check if two strings are anagrams
    private static boolean areAnagrams(String s1, String s2) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanS1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanS2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the sorted character arrays are equal
        char[] charArrayS1 = cleanS1.toCharArray();
        char[] charArrayS2 = cleanS2.toCharArray();

        Arrays.sort(charArrayS1);
        Arrays.sort(charArrayS2);

        return Arrays.equals(charArrayS1, charArrayS2);
    }

}
