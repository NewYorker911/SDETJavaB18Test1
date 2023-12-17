package class18;

public class Degree {

    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Degree{

}

class Masters extends Degree{

    public void getPrerequisite(){
        System.out.println("Highest degree");
    }
}

class DegreeTester{
    public static void main(String[] args) {
        Degree d=new Degree();
        d.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();
    }



}
