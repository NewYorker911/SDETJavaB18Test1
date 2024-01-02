package class22;

import java.util.ArrayList;

public class TaskArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Vlad");
        names.add("Vladyslav");
        names.add("Nick");
        names.add("Mike");
        names.add("Susanne");
        names.add("Lui");

        //names.isEmpty();

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Vlad"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
