package class12;

public class Task6 {
    public static void main(String[] args) {

        String str="Mom";
        String reverseWord="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverseWord=reverseWord+str.charAt(i);

        }
        if (str.equalsIgnoreCase(reverseWord)){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Its not a Palindrome");
        }

    }
}
