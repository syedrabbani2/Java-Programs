import java.util.Scanner;

public class TemperatureConverterFromFahrenheitToCelsius{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit:");
		double Fahrenheit = scan.nextDouble();
		
		double celsius=(Fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius:"+celsius);
	}
}