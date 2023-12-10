package review6;

public class E11StringDemo {
    public static void main(String[] args) {

        String str="My name is Vlad my Number is 3477393922";
        String number=str.replaceAll("[^0-9]", "");
        System.out.println(number);

        ///////////////////////////////////////////////////////////

        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(stringBuilder);

    }
}
