package class22;

import java.util.ArrayList;

public class TaskArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Rum");
        drinks.add("Jin");
        drinks.add("Beer");

        for (int i = 0; i < drinks.size(); i++) {
            String d= drinks.get(i);
            if (d.contains("a") || d.contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);

    }
}
