import java.util.Scanner;
import java.util.Arrays;

public class Calculator {

    Scanner input = new Scanner(System.in);

    // Method for adding two variables
    public void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result = " + result);
    }

    // Method for adding three variables
    public void add(double num1, double num2, double num3) {

        double result = num1 + num2 + num3;
        System.out.println("Result = " + result);
    }

    // Method for adding four variables
    public void add(double num1, double num2, double num3, double num4) {

        double result = num1 + num2 + num3 + num4;
        System.out.println("Result = " + result);
    }

    //  Method for subtracting two variables
    public void subtract(double num1, double num2) {

        double result = num1 - num2;
        System.out.println("Result = " + result);
    }

    //  Method for subtracting three variables
    public void subtract(double num1, double num2, double num3) {

        double result = num1 - num2 - num3;
        System.out.println("Result = " + result);
    }

    //  Method for subtracting four variables
    public void subtract(double num1, double num2, double num3, double num4) {

        double result = num1 - num2 - num3 - num4;
        System.out.println("Result = " + result);
    }

    // Method for multiplying integers
    public void multiply(int num1, int num2) {

        int result = num1 * num2;
        System.out.println("Result = " + result);
    }

    // Method for multiplying floats
    public void multiply(float num1, float num2) {

        float result = num1 * num2;
        System.out.println("Result = " + result);
    }

    // Method for dividing two integers
    public void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error. You can't divide by zero");
        } else {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        }
    }

    // Method for dividing two floats
    public void divide(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Error. You can't divide by zero");
        } else {
            float result = num1 / num2;
            System.out.println("Result = " + result);
        }
    }

    // Method for factorial
    public void factorial(int num) {
        
        int result;
        // Check if the number is negative
        if (num < 0) {
            System.out.println("Error. You can't get factorial of a negative number");
            // Exit the method if the number is negative
            return;
        } else if (num == 0) {
            // Factorial of 0 is defined as 1
            result = 1;
        } else {
            // Set the initial value of the result to the number
            result = num;
        }

        for (int i = num - 1; i > 1; i--) {
            // Multiply the result by each decreasing number
            result *= i;
        }

        System.out.println("Result = " + result);
    }

    // Method for summation
    public void summation(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            // Add the result by each decreasing number
            sum += i;
        }
        System.out.println("Result = " + sum);
    }

    // Method for checking prime
    public void prime(int num) {

        if (num <= 1) {
            System.out.println(num + " is not prime");
            return;
        }
        // Iterate from 2 to the square root of the number
        for (int i = 2; i < Math.pow(num, 0.5); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                return;
            }
        }
        System.out.println(num + " is prime");
        return;
    }

    // Method for adding two arrays
    public void sumArrays(int[] array1, int[] array2) {

        // Take number of elements in both array
        System.out.println("Enter number of elements for first array: ");
        int array1Size = input.nextInt();
        System.out.println("Enter number of elements for second array: ");
        int array2Size = input.nextInt();

        // Both array must have same number of elements
        if (array1Size != array2Size) {
            System.out.println("Both arrays must have same number of elements.");
        } else {
            // Declare three array with given size
            array1 = new int[array1Size];
            array2 = new int[array2Size];
            int result[] = new int[array1Size];

            // Take input for array elements
            System.out.println("Enter elements of first array: ");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = input.nextInt();
            }

            System.out.println("Enter elements of second array: ");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = input.nextInt();
            }

            // Loop to iterate through the array
            for (int i = 0; i < result.length; i++) {
                result[i] = array1[i] + array2[i];
            }

            // Display the result
            System.out.println("Result = " + Arrays.toString(result));
        }
    }

    // Method for checking the number in array
    public void checkNum(int[] array, int num) {

        // Take number of elements in array
        System.out.println("Enter number of elements for the array: ");
        int arraySize = input.nextInt();

        // Declare three array with given size
        array = new int[arraySize];

        // Take input for array elements
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Initialize a variable to track
        boolean found = false;

        // Iterate through each element
        for (int element : array) {

            // Check if it contains
            if (element == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(num + " is in the array");
            return;
        } else {
            System.out.println(num + " is not in the array");
            return;
        }
    }

    // Method for standart deviation
    public void standartDeviation() {

        // Create an array of 100 numbers
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        double sum = 0.0, sD = 0.0;
        int length = array.length;

        // Calculate the mean
        for (double num : array) {
            sum += num;
        }

        double mean = sum / length;

        // Calculate the sum of squared differences from the mean
        for (double num : array) {
            sD += Math.pow(num - mean, 2);
        }

        // Calculate the standard deviation
        System.out.println("Result = " + Math.pow(sD / length, 0.5));

    }

}
