package class16;

public class Teacher {
    String name;
    int age;
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    // Behaviors
    public void introduce() {
        System.out.println("Hi, I'm " + name + ". I teach " + subject + ".");
    }

    public void teach() {
        System.out.println("Teaching the subject: " + subject);
    }

    public void gradePapers() {
        System.out.println("Grading papers for the subject: " + subject);
    }

    public void conductOfficeHours() {
        System.out.println("Conducting office hours for the subject: " + subject);
    }
}

// Subclass 1
class MathTeacher extends Teacher {
    // Additional features or behaviors specific to MathTeacher can be added here
    public MathTeacher(String name, int age) {
        super(name, age, "Mathematics");
    }
}

// Subclass 2
class ChemistryTeacher extends Teacher {
    // Additional features or behaviors specific to ChemistryTeacher can be added here
    public ChemistryTeacher(String name, int age) {
        super(name, age, "Chemistry");
    }
}

// Subclass 3
class PianoTeacher extends Teacher {
    // Additional features or behaviors specific to PianoTeacher can be added here
    public PianoTeacher(String name, int age) {
        super(name, age, "Piano");
    }
}

