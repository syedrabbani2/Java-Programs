import java.util.Scanner;

public class SimpleInterest {
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        if (principal <= 0 || rate <= 0 || time <= 0) {
            System.out.println("Principal, rate, and time must be positive numbers.");
        } else {
            double interest = calculateSimpleInterest(principal, rate, time);
            System.out.println("The simple interest is: " + interest);
        }

        
    }
}
