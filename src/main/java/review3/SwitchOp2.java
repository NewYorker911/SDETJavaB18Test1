package review3;

public class SwitchOp2 {
    public static void main(String[] args) {

        char choice='Y';

        switch (choice){

            case 'y':
                System.out.println("Means Yes");
                break;
            case 'n':
                System.out.println("Means No");
                break;
            case 'm':
                System.out.println("Means Maybe");
                break;
            default:
                System.out.println("I don't understand you");
        }

    }
}
