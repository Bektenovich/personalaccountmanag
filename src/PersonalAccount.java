import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    // Constructor
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;  // Initial balance is 0
        this.transactions = new ArrayList<>();
    }

    // Method to deposit money
    public void deposit(double amount) {
        Amount deposit = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(deposit);
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            Amount withdrawal = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawal);
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to print transaction history
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account Number: " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to get account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }
}
