package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> lHeshSet=new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(lHeshSet);
        System.out.println(aList);


    }
}
