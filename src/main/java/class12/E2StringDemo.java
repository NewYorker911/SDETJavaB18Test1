package class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String str="Its Saveras Birthday today. Its Sunday. Tday is Java Class";
        String [] wordArr=str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[5]);

    }
}
