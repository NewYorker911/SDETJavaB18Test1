package class13;

public class PrinterTester {
    public static void main(String[] args) {
        Printer p=new Printer();

        p.printHello();

        p.printWord("Vlad");

        p.printManyTimes("Java", 10);
    }
}
