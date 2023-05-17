package homeworkForBankAccount;

import enums.AccountType;

public class SavingAccount extends BankAccount{

    public SavingAccount(String ownerName, AccountType accountType, double interestRate) {
        super(ownerName, accountType);
        this.interestRate=interestRate;
    }

    int time;
    private double interestRate;
    double calculateInterest(){
        return getBalance()*(interestRate/100)*time;
    }

    public String toString(){
        //return getAccountNumber() + "," +getOwnerName()+","+getBalance()+","+getAccountType()+","+calculateInterest();
        return super.toString()+"Interest rate " + interestRate;
    }

}
