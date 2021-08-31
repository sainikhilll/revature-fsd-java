import java.util.Scanner;
public class VoteEligibilityChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Age");
		
		int age = scanner.nextInt();
		
		if(age < 18)
		{
			System.out.println("Cannot vote");
		}
		else
		{
			System.out.println("Can vote");
		}

	}

}
