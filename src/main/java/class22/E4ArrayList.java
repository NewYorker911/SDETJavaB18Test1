package class22;

import java.util.ArrayList;

public class E4ArrayList {

    public static void main(String[] args) {
        // print yes if a name contains the
        // letter o otherwise no for all names

        ArrayList<String> names=new ArrayList<>();
        names.add("Vlad");
        names.add("Vladyslav");
        names.add("Nick");
        names.add("Mike");
        names.add("Susanne");
        names.add("Lui");

        for(String s:names){
            if (s.contains("o")){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }


    }
}
