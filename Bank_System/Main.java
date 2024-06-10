package Bank_System;

public class Main {
 public static void main(String[] args) {
     // Create accounts
     SavingsAccount savingsAccount = new SavingsAccount(1000.00);
     CurrentAccount currentAccount = new CurrentAccount(500.00);

     // Perform transactions
     Transaction transaction = new Transaction();

     System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());
     transaction.performTransaction(savingsAccount, 100.00, "deposit");
     System.out.println("Savings Account Balance after deposit: " + savingsAccount.getBalance());
     System.out.println();

     System.out.println("Initial Checking Account Balance: " + currentAccount.getBalance());
     transaction.performTransaction(currentAccount, 50.00, "withdraw");
     System.out.println("Checking Account Balance after withdrawal: " + currentAccount.getBalance());

     // Total accounts
     System.out.println("Total bank accounts: " + Bank.getTotalAccounts());
 }
}
