import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 4== 0);

       
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
