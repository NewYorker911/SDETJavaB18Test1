package class14;

public class PersonTester {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.name="Vlad";
        p1.age=36;
        p1.weight=78;
        p1.printInfo();
        System.out.println(Person.noOfeyes);

        Person p2=new Person();
        p2.name="Nataliia";
        p2.age=36;
        p2.weight=68;
        p2.printInfo();
        System.out.println(Person.noOfeyes);

    }
}
