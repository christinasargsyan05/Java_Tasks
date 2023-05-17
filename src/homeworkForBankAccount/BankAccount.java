package homeworkForBankAccount;

import enums.AccountType;

public class BankAccount implements Account {

    private static int count=0;
    //the current balance of the account
    private double balance;

    //a unique identifier for the account
    private final int accountNumber;

    //the name of the account owner
    private final String ownerName;

    //the type of the account (CHECKING or SAVINGS)
    private final AccountType accountType;

    //constructor that takes in the ownerName,
    //accountNumber, and accountType,
    //and initializes the balance to 0.0.
    public BankAccount(String ownerName, AccountType accountType) {
        this.balance = 0.0;
        this.accountNumber =count;
        count++;
        this.ownerName = ownerName;
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance > amount) {
            System.out.println("Your balance is not enough to get " + amount);
            return;
        }
        this.balance -= amount;
    }

    @Override
    public boolean balance() {
        return balance > 0;
    }

    @Override
    public String getAccountNumber() {
        return String.valueOf(accountNumber);
    }

    @Override
    public String getOwnerName()
    {
        return ownerName;
    }

    public String toString() {
        return ("Account number" + accountNumber + "\nOwner name " + ownerName + "\nBalance" + balance + "," + accountType);
    }

}
