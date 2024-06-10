package Bank_System;

final class Transaction {
 private final double transactionFee = 2.50;

 public final void performTransaction(Account account, double amount, String type) {
     if (type.equalsIgnoreCase("deposit")) {
         account.deposit(amount - transactionFee);
     } else if (type.equalsIgnoreCase("withdraw")) {
         account.withdraw(amount + transactionFee);
     }
     System.out.println("Transaction performed.");
     System.out.println("Transaction Fee: " + transactionFee);
     System.out.println("Current Balance: " + account.getBalance());
 }
}
