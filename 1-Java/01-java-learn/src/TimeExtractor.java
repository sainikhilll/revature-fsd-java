import java.util.Scanner;
public class TimeExtractor {

	public static void main(String[] args) {
		
		System.out.print("Enter Time in hh:mm:ss format : ");
		Scanner scanner = new Scanner(System.in);
		
		String time = scanner.nextLine();
		
		System.out.println(time.substring(3,5));
	}

}
