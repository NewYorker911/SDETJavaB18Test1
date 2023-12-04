package class10;

public class PersonTester {
    public static void main(String[] args) {

        Person p1=new Person();

        p1.age=36;
        p1.gender='M';
        p1.marriage="Married";
        p1.name="Vlad";

        System.out.println(p1.age);
        System.out.println(p1.gender);
        System.out.println(p1.marriage);
        System.out.println(p1.name);

        p1.run();
        p1.sleep();

    }

}
