package class23;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {
// First way
        Set<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Russia");
        countries.add("China");
        countries.add("Spain");
        countries.add("Laos");

        System.out.println(countries);
// Second way to resolve
        for(String country:countries){
            System.out.println(country);
        }

    }
}
