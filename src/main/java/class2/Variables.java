package class2;

public class Variables {

    public static void main(String[] args) {

        String fName="Vladyslav";
        String lName="Yaremchuk";
        String city="New York";
        String state="New York";
        //int pNumber=1234567; //or its could be the String because PN conteince the symbols like + Ex:
        String pNumber="+380503456789";                        //String pNumber="+380504567894"


        System.out.println("My first name is "+fName+" "+"my last name is "+lName);
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("And my phone number is "+pNumber);

        city="Brooklyn";
        state="United States";
        pNumber="+13467869098";
        System.out.println("My name is "+fName+" and I moved to city "+city+" and new state "+state);
        System.out.println("My new phone number is "+pNumber);


    }

}
