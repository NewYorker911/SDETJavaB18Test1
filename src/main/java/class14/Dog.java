package class14;

public class Dog {
    String name;//instance variable


    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Chacki";
        d1.printInfo();

    }
}
