package class15;

public class Teacher {

    private String name;
    private String address;
    //private int age;
    //private int salary;

    public Teacher(String name, String address){
        this.name=name;
        this.address=address;
       // this.age=age;
        //this.salary=salary;
    }


    public void teacherInfo (){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Teacher t1=new Teacher("Asghar", "Pakistan");
        t1.teacherInfo();
    }
}
