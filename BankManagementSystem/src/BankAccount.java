import java.util.*;
public class BankAccount {
	private String accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(String  accNo, String name, double balance) {
		this.accountNumber=accNo;
		this.name=name;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Successfully deposited");
	}
	
	public void withdraw(double amount) {
		if(amount<balance) {
			balance-=amount;
			System.out.println("Withdraw successful");
		}
		else {
			System.out.println("Insufficient balance");
		}
		
		public void display() {
			System.out.println("Account Number: "+accountNumber);
			System.out.println("Name: "+name);
			System.out.println("Balance: "+balance);
		}
		
		public String getAccountNumber() {
			return accountNumber;
		}
	}
}
