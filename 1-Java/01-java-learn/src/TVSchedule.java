
public class TVSchedule {

	public static void main(String[] args) {
		LinePrinter.printLine();
		System.out.println("Using while loop:");
		LinePrinter.printLine();
		int date = 2;
		while (date <= 31) {
			System.out.println(date);
			date += 3;
		}
		date = 2;
		LinePrinter.printLine();
		System.out.println("Using do..while loop:");
		LinePrinter.printLine();
		do {
			System.out.println(date);
			date += 3;
		} while (date <= 31);
		LinePrinter.printLine();
		System.out.println("Using for loop:");
		LinePrinter.printLine();
		for (date = 2; date <= 31; date += 3) {
			System.out.println(date);
		}
	}
}
