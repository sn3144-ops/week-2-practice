import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        // Bonus rule: 5% if service > 5 years
        if (years > 5) {
            bonus = salary * 0.05;
        }

        // Output result
        System.out.println("The bonus amount is " + bonus);
    }
}