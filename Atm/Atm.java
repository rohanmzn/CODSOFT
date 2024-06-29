package Atm;

import java.util.Scanner;

public class Atm {
    private BankAccount account;

    public Atm(BankAccount account) {
        this.account = account;
    }
    
    public static void decor() {
        System.out.println("***********************************************");
    }

    static void displayWelcomeMessage() {
        decor();
        System.out.println("*********** WELCOME TO CODSOFT ATM ************");
        decor();
    }

    static int displayMenu(Scanner sc) {
        System.out.println("\nMenu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("\nEnter your option:");
        int option = sc.nextInt();
        return option;
    }

    public String deposit(double amount) {
        return account.deposit(amount);
    }

    public String withdraw(double amount) {
        return account.withdraw(amount);
    }

    public String checkBalance() {
        return account.getBalance();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayWelcomeMessage();
        System.out.print("Enter your initial balance:");
        Double initialAmt = sc.nextDouble();
        
        Atm myATM = new Atm(new BankAccount(initialAmt));

        int action;
        do {
            action = displayMenu(sc);

            switch (action) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    decor();
                    System.out.println(myATM.withdraw(withdrawAmount));
                    decor();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    decor();
                    System.out.println(myATM.deposit(depositAmount));
                    decor();
                    break;

                case 3:
                    decor();
                    System.out.println(myATM.checkBalance());
                    decor();
                    break;

                case 4:
                    decor();
                    System.out.println("Thank you for using ATM. Have a Good Day!");
                    decor();
                    break;

                default:
                    decor();
                    System.out.println("Invalid Option");
                    decor();
            }
        } while (action != 4);

        sc.close();
    }
}
