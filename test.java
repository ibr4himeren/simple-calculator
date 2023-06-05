import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ieren
 */
public class testClass {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("===================================\n"
                + "------------- Hello ---------------\n"
                + "===================================");

        Scanner input = new Scanner(System.in);

        String input1;

        boolean stop = false;
        System.out.println("\nWhat do you want to do: ");
        do {

            input1 = input.nextLine();

            switch (input1) {

                case "1":

                    System.out.println("How many numbers for addition: ");
                    int input2 = input.nextInt();

                    switch (input2) {
                        case 2:

                            System.out.println("Enter the first number: ");
                            double num1 = input.nextDouble();
                            System.out.println("Enter the second number: ");
                            double num2 = input.nextDouble();

                            calculator.add(num1, num2);
                            System.out.println("===================================");
                            break;

                        case 3:

                            System.out.println("Enter the first number: ");
                            num1 = input.nextDouble();
                            System.out.println("Enter the second number: ");
                            num2 = input.nextDouble();
                            System.out.println("Enter the third number: ");
                            double num3 = input.nextDouble();

                            calculator.add(num1, num2, num3);
                            System.out.println("===================================");
                            break;

                        case 4:

                            System.out.println("Enter the first number: ");
                            num1 = input.nextDouble();
                            System.out.println("Enter the second number: ");
                            num2 = input.nextDouble();
                            System.out.println("Enter the third number: ");
                            num3 = input.nextDouble();
                            System.out.println("Enter the fourth number: ");
                            double num4 = input.nextDouble();

                            calculator.add(num1, num2, num3, num4);
                            System.out.println("===================================");
                            break;
                    }
                    break;

                case "2":

                    System.out.println("How many numbers for subtraction: ");
                    input2 = input.nextInt();

                    switch (input2) {
                        case 2:

                            System.out.println("Enter the first number: ");
                            double num1 = input.nextDouble();
                            System.out.println("Enter the second number: ");
                            double num2 = input.nextDouble();

                            calculator.subtract(num1, num2);
                            System.out.println("===================================");
                            break;

                        case 3:

                            System.out.println("Enter the first number: ");
                            num1 = input.nextDouble();
                            System.out.println("Enter the second number: ");
                            num2 = input.nextDouble();
                            System.out.println("Enter the third number: ");
                            double num3 = input.nextDouble();

                            calculator.subtract(num1, num2, num3);
                            System.out.println("===================================");
                            break;

                        case 4:

                            System.out.println("Enter the first number: ");
                            num1 = input.nextDouble();
                            System.out.println("Enter the second number: ");
                            num2 = input.nextDouble();
                            System.out.println("Enter the third number: ");
                            num3 = input.nextDouble();
                            System.out.println("Enter the fourth number: ");
                            double num4 = input.nextDouble();
                            calculator.subtract(num1, num2, num3, num4);
                            System.out.println("===================================");
                            break;
                    }
                    break;

                case "3":
                    System.out.println("Type of variables for multiplication: ");
                    input2 = input.nextInt();

                    switch (input2) {
                        case 1:

                            System.out.println("Enter the first number: ");
                            int num1 = input.nextInt();
                            System.out.println("Enter the second number: ");
                            int num2 = input.nextInt();

                            calculator.multiply(num1, num2);
                            System.out.println("===================================");
                            break;

                        case 2:

                            System.out.println("Enter the first number: ");
                            float num3 = input.nextFloat();
                            System.out.println("Enter the second number: ");
                            float num4 = input.nextFloat();

                            calculator.multiply(num3, num4);
                            System.out.println("===================================");
                            break;
                    }
                    break;

                case "4":
                    System.out.println("Type of variables for division: ");
                    input2 = input.nextInt();

                    switch (input2) {
                        case 1:

                            System.out.println("Enter the first number: ");
                            int num1 = input.nextInt();
                            System.out.println("Enter the second number: ");
                            int num2 = input.nextInt();

                            calculator.divide(num1, num2);
                            System.out.println("===================================");
                            break;

                        case 2:

                            System.out.println("Enter the first number: ");
                            float num3 = input.nextFloat();
                            System.out.println("Enter the second number: ");
                            float num4 = input.nextFloat();

                            calculator.divide(num3, num4);
                            System.out.println("===================================");
                            break;
                    }
                    break;

                case "5":
                    System.out.println("Enter one number for factorial: ");
                    int num = input.nextInt();
                    calculator.factorial(num);
                    System.out.println("===================================");
                    break;

                case "6":
                    System.out.println("Enter one number to start the summation: ");
                    int start = input.nextInt();
                    System.out.println("Enter one number to end the summation");
                    int end = input.nextInt();
                    calculator.summation(start, end);
                    System.out.println("===================================");
                    break;

                case "7":
                    System.out.println("Enter one number to check if it is prime: ");
                    int num1 = input.nextInt();
                    calculator.prime(num1);
                    System.out.println("===================================");
                    break;

                case "8":
                    int[] array1 = {1};
                    int[] array2 = {1};
                    calculator.sumArrays(array1, array2);
                    System.out.println("===================================");
                    System.out.println("What do you want to do?");

                    break;

                case "9":
                    int[] array3 = {1};
                    System.out.println("Enter a number to search for it: ");
                    int num3 = input.nextInt();
                    calculator.checkNum(array3, num3);
                    System.out.println("===================================");
                    break;

                case "10":
                    calculator.standartDeviation();
                    System.out.println("===================================");
                    System.out.println("What do you want to do: ");
                    break;

                default:
                    System.out.println("What do you want to do?");
                    break;

                case "stop":
                    System.out.println("===================================\n"
                            + "------------- Thanks --------------\n"
                            + "===================================");
                    stop = true;

            }

        } while (!stop);
    }

}
