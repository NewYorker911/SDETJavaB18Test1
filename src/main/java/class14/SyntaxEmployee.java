package class14;

public class SyntaxEmployee {

    int empId;
    int salary;

    static String ceo="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee employee1=new SyntaxEmployee();

        employee1.empId=1234;
        employee1.salary=6000;

        SyntaxEmployee employee2=new SyntaxEmployee();
        employee2.empId=5678;
        employee2.salary=6500;

        System.out.println(employee1.empId+", "+employee1.salary+", "+ceo);
        System.out.println(employee2.empId+", "+employee2.salary+", "+ceo);


    }

}
