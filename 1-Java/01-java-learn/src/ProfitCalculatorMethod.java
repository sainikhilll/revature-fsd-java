import java.util.Scanner;

public class ProfitCalculatorMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Buying Price:");
		int buyingPrice = scanner.nextInt();

		System.out.print("Enter the Selling Price:");
		int sellingPrice = scanner.nextInt();

		scanner.close();
		int profitReturned = profitCalculator(buyingPrice, sellingPrice);
		System.out.println("profit : " + profitReturned);

	}

	public static int profitCalculator(int buyingPrice, int sellingPrice) {
		int profit = sellingPrice - buyingPrice;
		return profit;
	}

}