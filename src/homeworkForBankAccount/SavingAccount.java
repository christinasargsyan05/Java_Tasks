package homeworkForBankAccount;

import enums.AccountType;

public class SavingAccount extends BankAccount{

    public SavingAccount(double balance, String accountNumber, String ownerName, AccountType accountType) {
        super(balance, accountNumber, ownerName, accountType);
    }

    int time;
    double interestRate;
    double calculateInterest(){
        return getBalance()*(interestRate/100)*time;
    }

    public String toString(){
        return getAccountNumber() + "," +getOwnerName()+","+getBalance()+","+accountType+","+calculateInterest();
    }

}
