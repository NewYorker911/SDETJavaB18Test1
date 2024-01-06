package review10;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        //store double value in full
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(12.0);
        numbers.add(10.0);
        numbers.add(34.0);
        numbers.add(25.0);
        numbers.add(5.0);
        System.out.println(numbers);
        //numbers.remove(0);
        numbers.remove(34.0);
        System.out.println(numbers);

    }
}
