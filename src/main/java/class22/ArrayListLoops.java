package class22;

import java.util.ArrayList;

public class ArrayListLoops {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Vlad");
        names.add("Vladyslav");
        names.add("Nick");
        names.add("Mike");
        names.add("Susanne");
        names.add("Lui");

        for (int i = 0; i < names.size(); i++) {
            //String s= names.get(i);
            System.out.println(names.get(i));
        }
        System.out.println("***************************");
        for(String s:names){
            System.out.println(s);
        }
    }
}
