package class19;

public class Student {



    public void studied(){
        System.out.println("Studied");
    }

    public void read(){
        System.out.println("Read");
    }

    public void watch(){
        System.out.println("Watch");
    }
}

class SyntaxStudent extends Student {


    @Override
    public void studied() {
        System.out.println("Studied a lot of Java");
    }
}

class CollegeStudent extends Student{

    public void read(){
        System.out.println("Read a lot of Java");
    }
}
class SchoolStudent extends Student{
    @Override
    public void watch() {
        System.out.println("Watch a lot of Java");
    }
}

class testerStudent{
    public static void main(String[] args) {

        Student [] sArr={new Student(), new CollegeStudent(), new SchoolStudent(), new SyntaxStudent()};

        for (int i = 0; i < sArr.length; i++) {

            Student stud=sArr[i];

            sArr[i].studied();
            sArr[i].watch();
            sArr[i].read();


        }
    }
}
