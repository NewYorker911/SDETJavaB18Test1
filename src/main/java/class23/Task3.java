package class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

        Set<String> cityes=new LinkedHashSet<>();
        cityes.add("New York");
        cityes.add("Kharkiv");
        cityes.add("Kyiv");
        cityes.add("Rome");
        cityes.add("Barselona");

        System.out.println(cityes);

        cityes.removeIf(x->x.startsWith("K"));

        System.out.println(cityes);

    }
}
