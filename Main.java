import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Initialize the account with a balance of 1000
        ATM atm = new ATM(account);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Select an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    scanner.nextLine(); // consume newline
                    break;
                case "2":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    scanner.nextLine(); // consume newline
                    break;
                case "3":
                    atm.checkBalance();
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;  // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nWelcome to the ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New balance is " + account.getBalance() + ".");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposited " + amount + ". New balance is " + account.getBalance() + ".");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is " + account.getBalance()+".");
}
}