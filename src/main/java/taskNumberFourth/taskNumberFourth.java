package taskNumberFourth;

import java.util.Scanner;

public class taskNumberFourth {
    public static void main(String[] args) {

        showInfo();
        try {
            validateTemperature(getTemperature());
        } catch (InvalidQuotaException ex){
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static double getTemperature() {

        Scanner scanner = new Scanner(System.in);
        return Double.valueOf(scanner.next());

    }

    private static void showInfo() {
        System.out.println("""
                Entered Enter the current temperature of the device , C
                """);
    }

    static void validateTemperature(Double temperature) throws InvalidQuotaException {
        if ((temperature < -10) || (temperature > 35)) {
            // Викид кастомного винятку
            throw new InvalidQuotaException("Attention! The device cannot operate outside the temperature range from -10 to +35 degrees!");
        } else {
            System.out.println("Temperature is good");
        }
    }

}
