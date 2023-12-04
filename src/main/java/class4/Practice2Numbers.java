package class4;

public class Practice2Numbers {

    public static void main(String[] args) {

        double num1=123;
        double num2=124;
        double num3=125;

        if (num1>num2){
            if (num1>num3){
                System.out.println("This is the largest number " +num1);

            }
        }else{
            if (num2>num3){
                System.out.println("Num2 is largest " +num2);
            }else {
                System.out.println("Num3 is largest " +num3);
            }
        }

    }

}
