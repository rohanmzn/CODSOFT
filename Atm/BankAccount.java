package Atm;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative. Setting balance to 0.");
        }
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return "Deposited " + amount + ". New balance: " + balance;
        } else {
            return "Deposit amount must be positive.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return "Withdrew " + amount + ". New balance: " + balance;
        } else {
            return "Invalid withdrawal amount or insufficient funds.";
        }
    }

    public String getBalance() {
        return "Current balance: " + balance;
    }
}
