package class15;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double salary;
    private String favoritePlanguage;

    public Person(String pName, int pAge, double pWeight, double pSalary, String pFavoritePLanguage){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;
        favoritePlanguage=pFavoritePLanguage;

    }

    public Person(String pName, int pAge, double pWeight, double pSalary){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;
        //favoritePlanguage=pFavoritePLanguage;

    }

    public void printInfo(){

        System.out.println(name+" "+age+" "+weight);
    }
}
