package review2;

public class ElseIf {
    public static void main(String[] args) {

        int worldCup=2002;

        if (worldCup==2002){
            System.out.println("Host country is Korea and Japan");
        } else if (worldCup==2006) {
            System.out.println("Host country is Germany");
        } else if (worldCup==2010) {
            System.out.println("Host country is South Africa");
        } else if (worldCup==2014) {
            System.out.println("Host country is Brazil");
        }else {
            System.out.println("Host country is unknown");
        }

    }
}
