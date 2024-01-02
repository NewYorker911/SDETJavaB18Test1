package class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();
        names.add("Vlad");
        names.add("Vladyslav");
        names.add("Nick");
        names.add("Mike");
        names.add("Susanne");
        names.add("Lui");
        System.out.println(names.size());
        System.out.println(names.contains("Vlad"));
        System.out.println(names.remove("Nick"));
        System.out.println(names.remove(3));
        System.out.println(names.get(0));
        names.set(0,"Nataliia");
        System.out.println(names);
        System.out.println(names.indexOf("Lui"));
    }
}
