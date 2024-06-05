import java.util.Scanner;

public class CompoundInterest{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the principle AMOUNT:");
		double principal = scan.nextDouble();
		
		System.out.println("Enter the annual rate(percentage):");
		double rate = scan.nextDouble();
		
		System.out.println("Enter the time period(in years):");
		double time = scan.nextDouble();
		
		double amount = principal * Math.pow(1+(rate/100),time);
		
		double compoundInterest = amount - principal;
		
		System.out.println("Compound Interest after "+ time + " years: "+ compoundInterest);
		
	}
}