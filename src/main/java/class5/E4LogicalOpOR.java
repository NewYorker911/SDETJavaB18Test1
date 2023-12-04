package class5;

public class E4LogicalOpOR {
    public static void main(String[] args) {

        boolean bringFlowers=true;
        boolean bringChocolates=true;
        boolean allMyMistake=true;

        if(bringChocolates||bringFlowers||allMyMistake){
            System.out.println("HomeMinister is happy");
        }else {
            System.out.println("HomeMinister is angry");
        }

    }
}
