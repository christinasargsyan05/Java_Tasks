package homeworkForBankAccount;

import enums.AccountType;
import interfaces.Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList< Account > accounts;

    public Bank() {
        accounts = new ArrayList < Account > ();
    }

    public void openAccount(String ownerName, AccountType accountType){
        //accounts.add(account);
    }
    public void closeAccount(Account account){
        accounts.remove(account);
    }
    public int getAccount(String accountNumber){
        int numberOfAccounts =Integer.parseInt(accountNumber);
        numberOfAccounts =accounts.size();
        return numberOfAccounts;
    }
    public double getTotalBalance(double balance){
        double total =0;
        return total;
    }

    public int getNumberOfAccounts(){
       int  countCurrentAccounts=0;
       countCurrentAccounts++;
       return countCurrentAccounts;
    }



}
