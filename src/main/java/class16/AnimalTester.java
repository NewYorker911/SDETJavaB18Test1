package class16;

public class AnimalTester {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.weight=23;
        d.age=12;
        d.color="Black";
        d.name="Jack";
        d.bark();
        d.printInfo();

        Cat c = new Cat();
        c.age=10;
        c.name="Leva";
        c.color="red";
        c.weight=10;
        c.sleep();
        c.printInfo();

    }
}
