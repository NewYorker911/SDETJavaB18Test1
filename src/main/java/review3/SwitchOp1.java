package review3;

public class SwitchOp1 {
    public static void main(String[] args) {

        int electionYear=2012;
        switch (electionYear){

            case 2020:
                System.out.println("President is Biden");
                break;
            case 2016:
                System.out.println("President is Trump");
                break;
            case 2012:
                System.out.println("President is Obama");
                break;
            default:
                System.out.println("President is unknown");
        }

    }
}
