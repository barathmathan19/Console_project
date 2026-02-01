import java.util.*;
public class BankingSystem {
	static Scanner  sc = new Scanner(System.in);
	static ArrayList<BankAccount> accounts = new ArrayList<>();
	
	
	public static void main(String[] args) {
		int choice;
		
		do {
            System.out.println("\n=== BANKING SYSTEM MENU ===");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    displayAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
		
		static void createAccount() {
			System.out.print("Enter account number: ");
			String accNo = sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter Initial balance: ");
			double balance = sc.nextDouble();
			sc.nextLine();
			
			BankAccount acc = new BankAccount(accNo, name, balance);
			acounts.add(acc);
			System.out.println("Account successfullt created");
		}
		
		static BankAccount findAccount(String accNo) {
			
		}

	}

}
