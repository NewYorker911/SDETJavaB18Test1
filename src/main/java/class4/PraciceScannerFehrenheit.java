package class4;

import java.util.Scanner;

public class PraciceScannerFehrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city name: ");
        String cityName = scanner.nextLine();
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperatureFahrenheit = scanner.nextDouble();
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
        System.out.println("The temperature in the city of " +cityName+ " is " +temperatureCelsius+ " degrees Celsius.");


    }

}
