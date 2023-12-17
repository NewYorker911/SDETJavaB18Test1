package class18;

public class CreditCard {



    void calculateInterest(double amount){
        double interest=amount*0.05;
        System.out.println("Interest on "+amount+" is "+interest);

    }
}

class Visa extends CreditCard{

    @Override
    void calculateInterest(double amount) {
        double interest=amount*0.07;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class AX extends CreditCard{

    @Override
    void calculateInterest(double amount) {
        double interest=amount*0.09;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class CreditCardTester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.calculateInterest(1000);

        Visa v=new Visa();
        v.calculateInterest(1000);

        AX ax=new AX();
        ax.calculateInterest(1000);
    }
}