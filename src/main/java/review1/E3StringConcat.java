package review1;

public class E3StringConcat {

    public static void main(String[] args) {

        String houseNo="H#295";
        String streetNo="Abc123";
        String state="New York";
        String country="USA";
        String completeAddress=houseNo+streetNo+state+country;
        String space=" "; //easy to add space inside the double breckets for example " Abc123"


        System.out.println(houseNo+space+streetNo+space+state+space+country);

        System.out.println(completeAddress);

    }
}
