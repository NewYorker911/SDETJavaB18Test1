package class7;

public class HWArrays3 {
    public static void main(String[] args) {

        String[] animals=new String[5];
        animals[0]="Tiger";
        animals[1]="Lion";
        animals[2]="Cat";
        animals[3]="Dog";
        animals[4]="Gorilla";

        for (int i=0; i<5; i++){
            System.out.print(animals[i]+", ");
        }
        System.out.println();

        int j=0;
        while (j<5){
            System.out.println(animals[j]+"; ");
            j++;
        }

    }
}
