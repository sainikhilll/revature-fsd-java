import java.util.Scanner;
public class CelsiusToFahrenheitConverterScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Celsius :");
		float celsius = scanner.nextFloat();
		
		float fahrenheit = (celsius * 9 / 5f) + 32;
		
		System.out.println("Fahrenheit = " + fahrenheit);
		System.out.println(scanner);
	}

}
