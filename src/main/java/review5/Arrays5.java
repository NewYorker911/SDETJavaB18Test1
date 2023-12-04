package review5;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        String  [] students=new String[5];
        students[0]="Kendi";
        students[1]="Kend";
        students[2]="Kei";
        students[3]="Ken";
        students[4]="Vendi";

        for (int i =0; i< students.length;i++){
            //System.out.println(students[i]+" ");

        }
        System.out.println(Arrays.toString(students));

    }
}
