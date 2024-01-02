package class22;

public class BankAccount {

    double balance;
    String userName;
    String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Loggin to account");
    }

    void transferFunds(){
        System.out.println("Transfering funds");
    }

    void resetPassword(){
        System.out.println("Reseting the password");
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
