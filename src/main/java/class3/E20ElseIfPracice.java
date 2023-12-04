package class3;

public class E20ElseIfPracice {

    public static void main(String[] args) {

        String trafficLight="Green";

        if (trafficLight.equals("Red")){
            System.out.println("Stop");
        } else if (trafficLight.equals("Yellow")) {
            System.out.println("Caution");
        } else if (trafficLight.equals("Green")) {
            System.out.println("Go");
        }
    }
}
