package Project2;

public class AlphaChar {

    public static void main(String[] args) {
        String inputString = "Hello123World";

        int alphaCount = countAlphaCharacters(inputString);

        System.out.println("Number of alphabetical characters: " + alphaCount);
    }

    private static int countAlphaCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                count++;
            }
        }

        return count;
    }
}


