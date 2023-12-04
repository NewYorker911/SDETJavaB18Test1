package class12;

public class Task2 {
    public static void main(String[] args) {

        String all="asdfGHJK098@#87<>/?";
        System.out.println(all.replaceAll("[^A-Za-z]","").length());

    }
}
