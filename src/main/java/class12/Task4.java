package class12;

public class Task4 {
    public static void main(String[] args) {

        String momName = "Mary Swift";
        String dadName = "Daniel";
        boolean isBoy = false;

        if (isBoy){
            String firstPartDad=dadName.substring(0,dadName.length()/2);
            String firstMomPart=momName.substring(momName.length()/2, momName.length());
            System.out.println(firstMomPart.trim()+firstPartDad.trim());
        }else {
            String momFirstPart=momName.substring(0,momName.length()/2);
            String dadLastPart=dadName.substring(dadName.length()/2, dadName.length());
            System.out.println(momFirstPart.trim()+dadLastPart.trim());
        }
    }
}
