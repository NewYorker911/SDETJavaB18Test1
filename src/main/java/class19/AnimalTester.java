package class19;

public class AnimalTester {

    public static void main(String[] args) {

        Animal a=new Dog("Jack", "Black", 10, 12);

        Dog d=(Dog) a;

        d.bark();

        Dog d1=new Dog("Jack", "Black", 10, 12);
        Cat c1=new Cat("Jack", "Black", 10, 12);
        Animal [] animals={d1, c1};
    }
}
