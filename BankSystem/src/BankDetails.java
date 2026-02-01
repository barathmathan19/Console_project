import java.util.*;

public class BankDetails {
	private String accno;
	private String name;
	private long balance;
	
	Scanner sc = new Scanner(System.in);
	
	public void openAccount(){
		System.out.println("Enter account no:");
		accno = sc.nextLine();
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter balance:");
		balance = sc.nextLong();
	}
	
	public void showAccount() {
		System.out.println("Name: "+name);
		System.out.println("Account no: "+accno);
		System.out.println("Balance: "+balance);
	}
	
	public void deposit() {
		long amount;
		System.out.println("Enter the amount to be deposited: ");
		amount = sc.nextLong();
		balance+=amount;
	}
	
	public void withdraw() {
		long amount;
		System.out.println("Enter the amount to be withdrawed: ");
		amount=sc.nextLong();
		if(amount>balance) {
			System.out.println("Insufficient balance!!!");
		}
		else {
			balance-=amount;
			System.out.println("Balance after withdrawal: "+balance);
		}
	}
	
}
