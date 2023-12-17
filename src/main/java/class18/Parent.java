package class18;

public class Parent {

    void marry(){
        System.out.println("Marry the girl");
    }
    void sleep(){
        System.out.println("Sleep 8 hours");
    }
}

class Karimi extends Parent{


    void marry(){
        System.out.println("Now this is print");
    }
}




class Tester{
    public static void main(String[] args) {
        Karimi k=new Karimi();
        k.marry();
        k.sleep();

    }
}
