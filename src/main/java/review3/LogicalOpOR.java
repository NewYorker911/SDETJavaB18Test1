package review3;

public class LogicalOpOR {
    public static void main(String[] args) {

        boolean rain=true;
        boolean cold=true;

        if (rain||cold){

            System.out.println("I am staying home");
        }
        String welcomeMessage="Welcome Admin";
        boolean dashboardFormDisplayed=false;

        if (welcomeMessage.equals("Welcome Admin")||dashboardFormDisplayed){
            System.out.println("Admin user is successfully logged in");
        }else {
            System.out.println("Cannot login using admin credentials");
        }
    }
}
