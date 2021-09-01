
public class AccountManager {

	public static void main(String[] args) {
		String accountNumber = "01302343794";
		double balance = 5000.0;

		System.out.println("Account Statment of " + accountNumber);
		System.out.println("intial Balance " + balance);

		System.out.println("\n--------------------------");
		System.out.println("Type  transaction  Balance");
		System.out.println("--------------------------");

		/*
		 * char type = 'W'; double transaction = 2000.0; balance = balance -
		 * transaction;
		 * 
		 * System.out.printf("%4c %12.2f %8.2f\n",type,transaction,balance);
		 * 
		 * type = 'D'; transaction = 20000; balance = balance + transaction;
		 * 
		 * System.out.printf("%4c %12.2f %8.2f\n",type,transaction,balance);
		 * 
		 * type = 'D'; transaction = 500.0; balance = balance + transaction;
		 * 
		 * System.out.printf("%4c %12.2f %8.2f\n",type,transaction,balance);
		 * 
		 * type = 'w'; transaction = 15500; balance = balance - transaction;
		 * 
		 * System.out.printf("%4c %12.2f %8.2f\n",type,transaction,balance);
		 * 
		 * type = 'D'; transaction = 10000; balance = balance;
		 * 
		 * System.out.printf("%4c %12.2f %8.2f\n",type,transaction,balance);
		 * 
		 * System.out.println("--------------------------");
		 */
		balance = calculateBalanceAndPrint('W', 2000.0, balance);
		balance = calculateBalanceAndPrint('D', 20000.0, balance);
		balance = calculateBalanceAndPrint('D', 500.0, balance);
		balance = calculateBalanceAndPrint('W', 15500.0, balance);
		balance = calculateBalanceAndPrint('W', 10000.0, balance);
	}

	public static double calculateBalanceAndPrint(char type, double transaction, double balance) {
		if (type == 'D') {
			balance += transaction;
		}
		if (type == 'W' && balance >= transaction) {
			balance -= transaction;
		}
		if (type == 'W' && balance < transaction) {
			balance = balance;
		}
		System.out.printf("%4c %12.2f %8.2f\n",type,transaction,balance);
		return balance;
	}

}
