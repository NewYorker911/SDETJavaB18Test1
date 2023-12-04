package review2;

public class NestedIF2 {

    public static void main(String[] args) {

        boolean isFriday=true;
        int day=13;

        if (isFriday){
            System.out.println("Movie night");

            if (day==13){
                System.out.println("Lets watch scary movie");
            }else {
                System.out.println("Lets watch something funy");
            }

        }else {
            System.out.println("No movies, go back to studies");
        }
    }

}
