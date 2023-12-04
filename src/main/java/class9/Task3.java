package class9;

public class Task3 {
    public static void main(String[] args) {

        String [] [] students={
                {"Mike","Hike","Spike","Dike"},
                {"A","B","C","D"}
        };
        for (int i=0;i<4;i++){
            if (students[1][i].equals("A")||students[1][i].equals("B"))
            System.out.println(students[0][i]+" "+students[1][i]);
        }

    }
}
