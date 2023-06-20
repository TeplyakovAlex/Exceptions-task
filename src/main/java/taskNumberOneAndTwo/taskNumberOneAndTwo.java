package taskNumberOneAndTwo;

import java.util.Scanner;

public class taskNumberOneAndTwo {
    public static void main(String[] args) {
        try {
            int option = getOption();

            Double data = getData(provideData(), option);
            getOutput(data);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds has occurred.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat has occurred.");
        }
//        getOutput(getData(provideData(),getOption()));
    }

    private static Double[] provideData() {
        return new Double[]{12.0, 43.0, 64.5, 77.6, 88.66};
    }


    private static int getOption() {
        System.out.println("""
                Choose an day:
                1 - Monday
                2 - Tuesday
                3 - Wednesday
                4 - Thursday
                5 - Friday
                """);
        Scanner scanner = new Scanner(System.in);
        return Integer. valueOf(scanner.next());
//                scanner.nextInt();
    }


    private static Double getData(Double[] data, int index) {

        return data[index];
    }

    private static void getOutput(Double output) {
        System.out.println("Price is -> USD " + output);
    }
}