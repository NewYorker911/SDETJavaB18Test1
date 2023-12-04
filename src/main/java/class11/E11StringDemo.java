package class11;

public class E11StringDemo {
    public static void main(String[] args) {

        String str="lskhdbv;KJHBkasbd!@38y98y9";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[l-v]","*"));
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println((int)'a');
        System.out.println(str.replaceAll("[\\d]",""));
        //use web page https://regexr.com/


    }
}
