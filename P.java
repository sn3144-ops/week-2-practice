import java.util.Scanner;

public class SmallestNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter number1: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter number3: ");
        double number3 = sc.nextDouble();

        // Check if first is smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}