package class19;

public class Computer {

    private String name;
    private int memeory;
    private int price;

    public Computer(String name, int memeory, int price) {
        this.name = name;
        this.memeory = memeory;
        this.price = price;
    }

    public void printInfo(){
        System.out.println(name+" "+memeory+" "+price);
    }

    public void setBrowsing(){
        System.out.println("Browsing internet");
    }

    public void setStudied(){
        System.out.println("Studied Java");
    }

    public void getCalculate() {
        System.out.println("Calculate math");
    }
}

class Apple extends Computer{
    public Apple(String name, int memeory, int price) {
        super(name, memeory, price);
    }

    @Override
    public void getCalculate() {
        System.out.println("On Apple computers calculate better");
    }
}
class Lenovo extends Computer{
    public Lenovo(String name, int memeory, int price) {
        super(name, memeory, price);
    }

    @Override
    public void setBrowsing() {
        System.out.println("Lenovo for browsing");
    }
}
class HP extends Computer{
    public HP(String name, int memeory, int price) {
        super(name, memeory, price);
    }

    public void myFirstComp () {
        System.out.println("HP my first computer");
        }

    @Override
    public void setStudied() {
        System.out.println("HP computers for study");
    }
}
class Dell extends Computer{
    public Dell(String name, int memeory, int price) {
        super(name, memeory, price);
    }
}

class computerTester{
    public static void main(String[] args) {

        Computer[]arr={new Apple("Apple", 16, 2000),
                new Lenovo("Lenovo", 12, 1500),
                new HP("HP", 16, 2000),
                new Dell("Dell", 12, 1600)};

        for (Computer c:arr){
            c.printInfo();
            c.getCalculate();
            c.setBrowsing();
            c.setStudied();
        }

    }


}
