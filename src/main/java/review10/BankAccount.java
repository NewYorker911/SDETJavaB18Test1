package review10;

public class BankAccount {

    private double balance;
    private String userName;
    private String password;

    public BankAccount(double balance, String userName, String password){
        setUserName(userName);
        setPassword(password);
        setBalance(balance);

    }

    void setBalance(double balance){
        if (balance<0){
            System.out.println("Not allowed");
            this.balance=0;
        }else {
            this.balance=balance;
        }

    }
    void setUserName(String userName){
        if (userName.length()<4){
            System.out.println("User Name should be more than 4 characters");
        }else {
            this.userName=userName;
        }
    }

    void setPassword(String password){
        this.password=password;
    }
    void transferFunds(double amountTransfer){
        balance=balance-amountTransfer;
    }

    double getBalance(){
        return balance;
    }


}
