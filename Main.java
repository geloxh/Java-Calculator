package PBL2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        Calculator number = new Calculator();
        boolean quit = false;

        while (!quit) {
            System.out.println("\n********** Calculator Operations **********");
            System.out.println("Choose the operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int h;
            try {
                h = calc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
                calc.next(); // Clear the invalid input
                continue;
            }

            float flo1, flo2;
            switch (h) {
                case 1:
                    number.sum();
                    break;
                case 2:
                    flo1 = getFloatInput(calc, "Enter the First Number: ");
                    flo2 = getFloatInput(calc, "Enter the Second Number: ");
                    number.diff(flo1, flo2);
                    break;
                case 3:
                    number.product();
                    break;
                case 4:
                    flo1 = getFloatInput(calc, "Enter the Dividend: ");
                    flo2 = getFloatInput(calc, "Enter the Divisor: ");
                    number.quo(flo1, flo2);
                    break;
                case 5:
                    flo1 = getFloatInput(calc, "Enter the Number: ");
                    number.sr(flo1);
                    break;
                case 6:
                    flo1 = getFloatInput(calc, "Enter the Base Number: ");
                    flo2 = getFloatInput(calc, "Enter the Exponent: ");
                    number.pow(flo1, flo2);
                    break;
                case 7:
                    number.mean();
                    break;
                case 8:
                    number.variance();
                    break;
                case 9:
                    System.out.println("Exiting the calculator. Goodbye!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option! Please choose between 1 and 9.");
            }

            if (!quit) {
                System.out.print("\nWould you like to continue? Press 1 for Yes, any other key to Exit: ");
                if (!calc.hasNextInt() || calc.nextInt() != 1) {
                    quit = true;
                    System.out.println("Thank you for using the calculator!");
                }
            }
        }
        calc.close();
    }

    // Helper function to get validated float input
    private static float getFloatInput(Scanner scanner, String message) {
        float value;
        while (true) {
            System.out.print(message);
            try {
                value = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
        return value;
    }
}
