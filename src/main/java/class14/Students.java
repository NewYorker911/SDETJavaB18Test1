package class14;

public class Students {

    String name;
    int ID;

    static int numberOfStudents;

    public static void main(String[] args) {
        Students s1=new Students();

        s1.ID=12;
        s1.name="Vlad";
        Students.numberOfStudents++;
        Students s2=new Students();
        s2.ID=23;
        s2.name="Nataliia";
        Students.numberOfStudents++;
        Students s3=new Students();
        s3.ID=34;
        s3.name="Liudmyla";

        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);
    }
}
