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
		if(amount != 0 && amount > 0) {
			balance += amount;
			previousTransaction = amount;
		}
		else {
			System.out.println("You cannot add a negative amount to your account!");
		}
	}
	
	// function to withdraw money from account
	void withdraw(int amount) {
		if(amount != 0 && amount > 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
		else {
			System.out.println("Check your balance before making this operation!");
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
		System.out.println();
		
		System.out.println("""
			  What do you want to do today? 
			  1 - Check your balance
			  2 - Make a deposit
			  3 - Make a withdrawal
			  4 - View your transactions
			  5 - Exit
			""".formatted());
		
		int option = 0;
		do {
			System.out.println("Enter a option from menu:");
			option = scanner.nextInt();
			switch(option){
				case 1:
					System.out.println("Balance = R$" + balance);
					break;
				case 2:
					System.out.println("How much do you wanna deposit?!");
					int amountDeposit = scanner.nextInt();
					deposit(amountDeposit); 
					break;
				case 3:
					System.out.println("How much do you wanna withdraw?!");
					int amountWithdraw = scanner.nextInt();
					withdraw(amountWithdraw);
					break;
				case 4:
					getPreviousTransaction();
					break;
				case 5:
					System.out.println("Transactions ended!");
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}
		} while(option  != 5);
		
		System.out.println("Thank you for using our Bank!");
		scanner.close();
	}
}

	
