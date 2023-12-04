package class12;

public class E1StringDemo {
    public static void main(String[] args) {

        String str="Its Saveras Birthday today. Its Sunday. Tday is Java Class";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());

    }
}
