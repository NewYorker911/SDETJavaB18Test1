package review9;

public abstract class Animal {

    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public abstract void eat();

    public abstract void speak();

    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}

class Dog extends Animal {


    String bread;
    public Dog(String name, String color, int age, String bread){

        super(name, color, age);
        this.bread=bread;
    }

    @Override
    public void eat() {
        System.out.println("Dogs like meat");
    }

    @Override
    public void speak() {
        System.out.println("Wuff Wufff");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(bread);
    }
}
