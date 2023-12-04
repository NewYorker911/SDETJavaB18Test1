package class7;

public class HWArrays2 {
    public static void main(String[] args) {

        String[] cars=new String[6];
        cars[0]="Toyota";
        cars[1]="Honda";
        cars[2]="Hyundai";
        cars[3]="Jeep";
        cars[4]="Lexus";
        cars[5]="Mercedes";

        for (int i=0; i<cars.length; i++){
            System.out.print(cars[i]+", ");
        }
        System.out.println();

        int j=0;
        while (j< cars.length){
            System.out.println(cars[j]+"; ");
            j++;
        }
    }
}
