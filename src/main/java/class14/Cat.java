package class14;

public class Cat {
    String name="Kitty";
//local variable has priority on instance variable
    void printName(){
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
