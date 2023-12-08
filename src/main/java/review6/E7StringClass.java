package review6;

public class E7StringClass {
    public static void main(String[] args) {

        String str="Today is a JAVA review class 1234";
        System.out.println(str.charAt(3));
        //all letters to lower case
        str=str.toLowerCase();
        int counter=0;
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isAlphabetic('#'));
        for (int i = 0; i < str.length(); i++) {

        }

    }
}
