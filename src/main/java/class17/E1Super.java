package class17;

public class E1Super {
    String name="Israel";
}
class Child extends E1Super{
    String name="Maria";

    void print(){
        String name="Levi";
        System.out.println(name);
    }
}

class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}

