package class21;

public class AnimalTester {
    public static void main(String[] args) {


        Animal [] arr={new Cat(), new Dog()};
            for(Animal a:arr){
                a.eat();
                a.sleep();
                a.speak();
            }

    }
}
