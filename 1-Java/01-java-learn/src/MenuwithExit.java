import java.util.Scanner;

public class MenuwithExit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int option = 400;
		
		while (option != 4) {
			
			System.out.println("	Menu	");
			System.out.println("=====================");
			System.out.println("1. Balance Enquiry");
			System.out.println("2. Recharge");
			System.out.println("3. Change Caller Tune");
			System.out.println("4. Exit");
			System.out.println("=====================");

			System.out.print("Choose an option :");
			option = scanner.nextInt();

			switch (option) {
			
			case 1:
				System.out.println("Balance Enquiry");
				break;
			case 2:
				System.out.println("Recharge");
				break;
			case 3:
				System.out.println("Change Caller Tune");
				break;
			case 4:
				break;
			default:
				System.out.println("Enter a valid option");

			}
		}

	}
}
