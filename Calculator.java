package PBL2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    Scanner input = new Scanner(System.in);

    // Addition
    public void sum() {
        System.out.print("Input the First Number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Input the Second Number: ");
        double num2 = input.nextDouble();
        
        double result = num1 + num2;
        System.out.println("The Sum of the Two Numbers is: " + result);
    }

    // Subtraction
    public void diff(float num1, float num2) {
        double result = num1 - num2;
        System.out.println("The Difference of the Two Numbers is: " + result);
    }

    // Multiplication
    public void product() {
        System.out.print("Input the First Number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Input the Second Number: ");
        double num2 = input.nextDouble();
        
        double result = num1 * num2;
        System.out.println("The Product of the Two Numbers is: " + result);
    }

    // Division
    public void quo(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double result = num1 / num2;
        System.out.println("The Quotient of the Two Numbers is: " + result);
    }

    // Square Root
    public void sr(float num) {
        if (num < 0) {
            System.out.println("Error: Square root of a negative number is not real.");
            return;
        }
        double result = Math.sqrt(num);
        System.out.println("The Square Root of the Number is: " + result);
    }

    // Power
    public void pow(float base, float exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("The Power of the Two Numbers is: " + result);
    }

    // Mean Calculation
    public double mean() {
        ArrayList<Double> numbers = new ArrayList<>();
        double sum = 0;
        
        System.out.println("Enter numbers (type 'end' to finish): ");
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double num = input.nextDouble();
                numbers.add(num);
                sum += num;
            } else if (input.next().equalsIgnoreCase("end")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or 'end'.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
            return 0;
        }

        double meanValue = sum / numbers.size();
        System.out.println("The Mean of the Given Numbers is: " + meanValue);
        return meanValue;
    }

    // Variance Calculation
    public void variance() {
        ArrayList<Double> numbers = new ArrayList<>();
        double meanValue = mean();
        if (numbers.isEmpty()) return;

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - meanValue, 2);
        }

        variance /= numbers.size();
        System.out.println("The Variance of the Given Numbers is: " + variance);
    }
}
