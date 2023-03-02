import java.util.Scanner;

public class ATMMachine {
	
	static double balance = 1000; // Initial account balance

	public static void main(String[] args) {
		
		System.out.println("Welcome to Our ATM Machine");
    	
    	
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("--------------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("--------------------------");
            System.out.print("Enter choice (1-4): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("--Thank you for using our ATM!--");
                    System.exit(0); // Exit program
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }

    // Display account balance
    public static void checkBalance() {
        System.out.println("Your balance is $" + balance);
    }

    // Deposit money into account
    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposited $" + amount + " successfully");
        System.out.println("Your balance is $" + balance);
    }

    // Withdraw money from account
    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully");
            System.out.println("Your balance is $" + balance);
        }
 
	}

}
