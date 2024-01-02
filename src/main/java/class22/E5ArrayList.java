package class22;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        // replace name to Java if a name contains the
        // letter A otherwise print no for all names

        ArrayList<String> names = new ArrayList<>();
        names.add("Vlad");
        names.add("Vladyslav");
        names.add("Nick");
        names.add("Mike");
        names.add("Susanne");
        names.add("Lui");

        for (int i = 0; i < names.size(); i++) {

            String origName= names.get(i);

            if (origName.contains("V")){
                names.set(i,"Java");
            }
        }
        System.out.println(names);
    }    
}
