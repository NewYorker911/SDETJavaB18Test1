package class16;

public class TeacherTest {
    public static void main(String[] args) {
        // Creating instances of each class
        MathTeacher mathTeacher = new MathTeacher("John Doe", 35);
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Jane Smith", 40);
        PianoTeacher pianoTeacher = new PianoTeacher("Alice Johnson", 30);

        // Testing behaviors
        mathTeacher.introduce();
        mathTeacher.teach();
        mathTeacher.gradePapers();
        mathTeacher.conductOfficeHours();

        chemistryTeacher.introduce();
        chemistryTeacher.teach();
        chemistryTeacher.gradePapers();
        chemistryTeacher.conductOfficeHours();

        pianoTeacher.introduce();
        pianoTeacher.teach();
        pianoTeacher.gradePapers();
        pianoTeacher.conductOfficeHours();
    }
}
