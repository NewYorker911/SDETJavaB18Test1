package review6;

public class E6StringDemo {
    public static void main(String[] args) {

        String str="Today is a JAVA review class";
        System.out.println(str.charAt(3));
        //all letters to lower case
        str=str.toLowerCase();
        int counter=0;

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));
            if (str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("Letter A appeared "+counter+" times.");
    }
}
