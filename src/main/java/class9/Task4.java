package class9;

public class Task4 {
    public static void main(String[] args) {

        /*
        Create a 2D Array of cars: american, german, italian, korean.
        Then retrieve all values from that array using 2 different loops
         */
        // Create a 2D array of cars
        String[][] cars = {
                {"Ford", "Chevrolet", "Dodge"},
                {"Mercedes-Benz", "BMW", "Volkswagen"},
                {"Ferrari", "Lamborghini", "Maserati"},
                {"Hyundai", "Kia", "Genesis"}
        };

        // Retrieve values using nested for loop
        System.out.println("Retrieving values using nested for loop:");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        // Retrieve values using enhanced for loop
        System.out.println("\nRetrieving values using enhanced for loop:");
        for (String[] carCountry : cars) {
            for (String car : carCountry) {
                System.out.println(car);
            }
        }
    }
}
