import java.util.Scanner;

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
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transactions occured!");
		}
	}
	
	// function that displays the menu to the user
	void showMenu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + name + "!");
		System.out.println("Here's your ID: " + id);
		System.out.println("What do you want to do today? ");
		System.out.println("1 - Check your balance");
		System.out.println("2 - Make a deposit");
		System.out.println("3 - Make a withdrawal");
		System.out.println("4 - View your transactions");
		System.out.println("5 - Exit");
		int option = scanner.nextInt();
		scanner.close();
	}
}

	
