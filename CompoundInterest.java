import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double compoundInterest = calculateCompoundInterest(principal, rate, time);

        System.out.println("Compound Interest after " + time + " years: " + compoundInterest);
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        
        rate = 100;

        
        double amount = principal * Math.pow(1 + rate, time);
        double compoundInterest = amount - principal;

        return compoundInterest;
    }
}
