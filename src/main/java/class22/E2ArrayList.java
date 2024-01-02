package class22;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Karimi");
        names.remove("Karimi");
        names.add("lusi");

        System.out.println(names.size());
        System.out.println(names.contains("lusi"));
    }
}
