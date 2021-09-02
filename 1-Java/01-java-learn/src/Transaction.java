
public class Transaction {
	private char type;
	private double amount;
	
	public Transaction(char type, double amount){
		this.type = type;
		this.amount = amount;
	}
	
	
	public char getType() {
		return type;
	}


	public double getAmount() {
		return amount;
	}


	public void displayTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n",type,amount,balance);
	}
	
	public static void main(String args[]) {
		Transaction transaction1 = new Transaction('W', 5000);
		Transaction transaction2 = new Transaction('D', 20000);
		Transaction transaction3 = new Transaction('D', 500);
		Transaction transaction4 = new Transaction('W', 15500);
		Transaction transaction5 = new Transaction('W', 10000);
		//transaction1.displayTransaction(2000);
		
		Transaction[] transactionArray = { transaction1, transaction2, transaction3, transaction4, transaction5};
		//double balance = 5000
		for (Transaction transaction : transactionArray) {
			//balance = AccountManager.calculateBalanceAndPrint(this.type, this.amount, balance);
			transaction.displayTransaction(2000);
		}
		
	}
}
