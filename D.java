import java.util.Scanner;

public class DivisibleByFiveChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}