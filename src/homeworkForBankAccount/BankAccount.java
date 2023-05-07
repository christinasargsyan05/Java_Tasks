package homeworkForBankAccount;

import enums.AccountType;
import interfaces.Account;

public class BankAccount implements Account {
    //the current balance of the account
    private double balance;

    //a unique identifier for the account
    private String accountNumber;

    //the name of the account owner
    private String ownerName;

    //the type of the account (CHECKING or SAVINGS)
    AccountType accountType;

    //constructor that takes in the ownerName,
    //accountNumber, and accountType,
    //and initializes the balance to 0.0.
    public BankAccount(double balance, String accountNumber, String ownerName, AccountType accountType) {
        this.balance = balance;
        balance = 0.0;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountType = accountType;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double deposit(double amount) {
            return amount+balance;
    }

    @Override
    public double withdraw(double amount) {

        return amount;
    }

    @Override
    public boolean balance() {
        if (balance>0)
            return true;
        return false;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public String toString(){
        return accountNumber + "," + ownerName + "," + balance + "," + accountType;
    }

}
