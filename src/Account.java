public class Account {
	int balance;
	int previousTransaction;
	String name;
	String id;
	
	// constructor of class
	Account(String customerName, String customerId){
		name = customerName;
		id = customerId;
	}
	
	// function to deposit money in the account
	void deposit(int amount) {
		if(amount != 0) {
			balance += amount;
			previousTransaction = amount;
		}
	}
	
	// function to withdraw money from account
	void withdraw(int amount) {
		if(amount != 0) {
			balance += balance - amount;
			previousTransaction = -amount;
		}
	}
	
	// function to show the previous transaction made on the account
	void getPreviousTransaction() {
		
	}
}

	
