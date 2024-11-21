import java.util.Scanner;

public class ATM {

    // Define the Account class inside the ATM class
    static class Account {
        private String accountNumber;
        private double balance;
        private String pin;

        // Constructor for Account
        public Account(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
            this.pin = "3210"; // Default PIN
        }

        // Method to verify PIN
        public boolean verifyPin() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(this.pin)) {
                System.out.println("PIN verified successfully.");
                return true;
            } else {
                System.out.println("Incorrect PIN.");
                return false;
            }
        }

        // Method to view account balance
        public void viewBalance() {
            System.out.println("Your current balance is: $" + this.balance);
        }

        // Method to deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited: $" + amount);
                System.out.println("Your new balance is: $" + this.balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Method to withdraw money from the account
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else if (amount > this.balance) {
                System.out.println("Insufficient balance.");
            } else {
                this.balance -= amount;
                System.out.println("Withdrawn: $" + amount);
                System.out.println("Your new balance is: $" + this.balance);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the Account object with a starting balance of 1000
        Account account = new Account("12345", 1000.00); 
        
        System.out.println("Welcome to the ATM!");

        // PIN verification
        if (!account.verifyPin()) {
            System.out.println("Invalid PIN. Exiting...");
            return;
        }

        // ATM Menu interaction loop
        int option;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    account.viewBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
