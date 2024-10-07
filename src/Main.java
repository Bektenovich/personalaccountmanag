public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "John Doe");

        // Perform transactions
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600);  // Should show insufficient balance

        // Print transaction history
        account.printTransactionHistory();

        // Display current balance
        System.out.println("Current Balance: " + account.getBalance());
    }
}
