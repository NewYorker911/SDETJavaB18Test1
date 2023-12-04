package class11;

public class Task4 {
    public static void main(String[] args) {

        String str="Ukraine";

        if (!str.isEmpty()){
            int len=str.length();
            if (len>=3&&len%2!=0){
                System.out.println(str.charAt(len/2));

            }
        }

    }
}
