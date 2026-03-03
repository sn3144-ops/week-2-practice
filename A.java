import java.util.Scanner;

public class LargestNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter number1: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter number3: ");
        double number3 = sc.nextDouble();

        // Check largest conditions
        boolean firstLargest  = (number1 > number2) && (number1 > number3);
        boolean secondLargest = (number2 > number1) && (number2 > number3);
        boolean thirdLargest  = (number3 > number1) && (number3 > number2);

        // Output
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}