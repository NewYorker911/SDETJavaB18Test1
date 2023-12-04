package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphone=new Phone();

        iphone. make="Apple";
        iphone.model="15Pro Max";
        iphone.hardware="A17pro";
        iphone.OperationSystem="iOS";
        iphone.price=1299;


        System.out.println(iphone.hardware);
        System.out.println(iphone.model);
        System.out.println(iphone.make);
        System.out.println(iphone.OperationSystem);
        System.out.println(iphone.price);


        iphone.call();
        iphone.message();
    }
}
