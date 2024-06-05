import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in percentage):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period (in years):");
        double time = scanner.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
        double totalAmount = principal + interest;

        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);

        
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
