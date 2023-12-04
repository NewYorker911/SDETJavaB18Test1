package class9;

public class E4Arrays2D {
    public static void main(String[] args) {

        int [][] matrix= {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };

        int[] row=matrix[0];
        System.out.println(row.length);
        for (int n:row){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println(matrix[2][2]);
    }
}
