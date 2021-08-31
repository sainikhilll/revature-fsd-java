import java.util.Scanner;
public class ShortNameValidation {

	public static void main(String[] args) {
		
		System.out.print("Enter Short Name : ");
		
		Scanner scanner = new Scanner(System.in);
		
		String shortName = scanner.nextLine();
		
		if ((shortName.length() > 1) && (shortName.length() < 7))
		{
			System.out.println("This is a valid Short Name");
			return;
		}System.out.println("This is not a valid Short Name");
	}

}
