
public class Account {
	private String accountNumber;
	private double balance;
	private Transaction[] transactions;
	
	public Account(String accountNumber, double balance, Transaction[] transactions) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = transactions;
	}
	
	
	//public void displayTransaction(double balance) {
	//	System.out.printf("%4c %12.2f %8.2f\n",type,amount,balance);
	//}
	
	
	
	public void printStatment() {
		System.out.println("Account Statment of " + accountNumber);
		System.out.println("intial Balance " + balance);

		System.out.println("\n--------------------------");
		System.out.println("Type  transaction  Balance");
		System.out.println("--------------------------");
		
		for (Transaction transaction : transactions) {
			if (transaction.getType() == 'D') {
				balance += transaction.getAmount();
			}
			if (transaction.getType() == 'W' && balance > transaction.getAmount()) {
				balance -= transaction.getAmount();
			}
			if (transaction.getType() == 'W' && balance < transaction.getType()) {
				balance = balance;
			}
			transaction.displayTransaction(balance);
		}

	}
	public static void main(String args[]) {
		Transaction transaction1 = new Transaction('W', 2000);
		Transaction transaction2 = new Transaction('D', 20000);
		Transaction transaction3 = new Transaction('D', 500);
		Transaction transaction4 = new Transaction('W', 15500);
		Transaction transaction5 = new Transaction('W', 10000);
		
		//float[] scores = { 48, 55, 78, 25, 22 };
		Transaction[] transactionArray = { transaction1, transaction2, transaction3, transaction4, transaction5 };
		Account account = new Account("01302343794", 5000.0, transactionArray);
		account.printStatment();
	}

}
