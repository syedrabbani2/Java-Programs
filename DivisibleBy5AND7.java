import java.util.Scanner;

public class DivisibleBy5AND7{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		if(num %5==0 && num %7==0) {
			System.out.println(num + " is divisible by both 5 & 7.");
		}else {
			System.out.println(num + " is not divisible by both 5 & 7.");
		}
	}
}