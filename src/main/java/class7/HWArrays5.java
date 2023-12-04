package class7;

public class HWArrays5 {
    public static void main(String[] args) {

        int[] num={12,23,34,45,56,67,78};
        int largest=num[0];

        for (int i=0; i< num.length; i++){
            if (largest<num[i]){
                largest=num[i];

            }

        }
        System.out.println("This is a largest number "+largest);

    }
}
