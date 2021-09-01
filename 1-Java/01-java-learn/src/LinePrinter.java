
public class LinePrinter {

	public static void main(String[] args) {
		printLine();
		printLine(10);
		printLine(0);
		printLine(20);
		//LinePrinter.printLine(); Another way of calling
	}
	public static void printLine() {
		System.out.println("---------------------------------");
	}
	public static void printLine(int numberOfCharcters) {
		for ( int i = 0; i < numberOfCharcters; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
