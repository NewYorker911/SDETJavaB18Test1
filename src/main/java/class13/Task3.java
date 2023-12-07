package class13;

public class Task3 {

    void palindrome(String word){

        String reversWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversWord=reversWord+word.charAt(i);

        }
        if (word.equalsIgnoreCase(reversWord)){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Its not a Palindrome");
        }


    }

    public static void main(String[] args) {
        Task3 pal=new Task3();
        pal.palindrome("Rotor");
    }

}
