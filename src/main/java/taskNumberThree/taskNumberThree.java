package taskNumberThree;

import java.util.Scanner;

public class taskNumberThree {
    private static final Double CASH_CARD = 20.0;

    public static void main(String[] args) {
        getValidate(filterOption(getOptionProduct()));

    }

    private static int getOptionProduct() {
        System.out.println("""
                Choose an product:
                1 - cigarettes ( USD 50 ) 
                2 - beer       ( USD 30 )
                3 - cake       ( USD 15 )
                4 - lozenge    ( USD 5 )
                5 - chewing gum( USD 40.99 )
                """);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
//
    }

    private static Double filterOption(int option) {
        double amountPayable;


        switch (option) {

            case 1 -> {
                amountPayable = 50.0;
            }
            case 2 -> {
                amountPayable = 30.0;
            }
            case 3 -> {
                amountPayable = 15.0;
            }
            case 4 -> {
                amountPayable = 5.0;
            }
            case 5 -> {
                amountPayable = 40.99;
            }
            default -> amountPayable = 0;
        }

        return amountPayable;
    }

    public static void getValidate(Double amountPayable) {
        if (amountPayable == 0) {
            throw new ArithmeticException("Invalid menu number");
        } else if (amountPayable > CASH_CARD) {

            throw new ArithmeticException("Insufficient funds. Operation error!");
        } else {
            System.out.println("Successful purchase :)");
        }
    }
}

