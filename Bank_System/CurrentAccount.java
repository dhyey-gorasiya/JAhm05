package Bank_System;

class CurrentAccount extends Account {
 private static final double OVERDRAFT_LIMIT = 100.00;

 public CurrentAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
         balance -= amount;
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

