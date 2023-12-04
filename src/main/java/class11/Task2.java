package class11;

public class Task2 {
    public static void main(String[] args) {
        //Count how many times letter "a" has appeared in the String
        String str="Java is Fun";
        //char target='a';
        int count=0;

        for (int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
