package review10;

public class BankAccountTester {
    public static void main(String[] args) {


        BankAccount b=new BankAccount(9990, "User123", "123qweasd");

        b.setBalance(10000);

        System.out.println(b.getBalance());


    }
}
