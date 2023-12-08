package review6;

public class Person {

    String name;
    int age;
    double weight;
    double height;


    void eat(){
        System.out.println("Eating");
    }
    String getName(){
        return name;
    }

    public static void main(String[] args) {

        Person p=new Person();

        p.name="Vlad";
        p.age=36;
        p.height=173;
        p.weight=76;
        System.out.print(p.name+", ");
        System.out.println(p.age);

        p.eat();
        String n= p.getName();
        System.out.println(n);

    }

}
