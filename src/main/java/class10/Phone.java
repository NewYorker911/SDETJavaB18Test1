package class10;

public class Phone {

    String make;
    String model;
    String hardware;
    String OperationSystem;
    int price;

    void call(){
        System.out.println("Ring Ring.....");
    }
    void message(){
        System.out.println("recive a message");
    }
    void internet(){
        System.out.println("Connect to internet");
    }
    void camera(){
        System.out.println("Can make photos and videos");
    }

}
