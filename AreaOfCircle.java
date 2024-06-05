import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the radius of the circle :");
		double radius=scan.nextDouble();
		
		double area = Math.PI*radius*radius;
		System.out.println("Area of the circle ="+area);
	}
}