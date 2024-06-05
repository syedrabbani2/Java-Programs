import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in percentage):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the number of years:");
        int years = scanner.nextInt();

        System.out.println("Enter the number of times interest is compounded per year:");
        int n = scanner.nextInt();

        double amount = calculateCompoundInterest(principal, rate, years, n);
        double interest = amount - principal;

        System.out.println("Compound Interest after " + years + " years: " + interest);
        System.out.println("Total Amount after " + years + " years: " + amount);

        
    }

    public static double calculateCompoundInterest(double principal, double rate, int years, int n) {
        double r = rate / 100;
        double amount = principal * Math.pow(1 + (r / n), n * years);
        return amount;
    }
}
