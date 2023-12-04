package review5;

public class Arrays2 {
    public static void main(String[] args) {
        int [] numbers={10,23,34,45,34,};
        //System.out.println(numbers.length);
        //System.out.println(numbers[1]);
        for (int i=0; i< numbers.length/2;i++){
            System.out.println(numbers[i]+" ");
        }
        System.out.println();
        for (int n:numbers){

            System.out.print(n+", ");
        }
    }
}
