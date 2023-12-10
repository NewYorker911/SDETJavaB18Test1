package class15;

public class Student {
    private String studentName;
    private double grade1;
    private double grade2;
    private double grade3;

    // Constructor
    public Student(String name, double g1, double g2, double g3) {
        studentName = name;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() { // public void calcAvg(){}
        return (grade1 + grade2 + grade3) / 3;
    }

    public static void main(String[] args) {
        // Test with two different students
        Student student1 = new Student("Alice", 85.5, 90.0, 78.5);
        Student student2 = new Student("Bob", 92.0, 88.5, 76.0);

        // Print average marks for each student
        System.out.println("Average grade for " + student1.studentName + ": " + student1.calculateAverageGrade());
        System.out.println("Average grade for " + student2.studentName + ": " + student2.calculateAverageGrade());
    }



}
