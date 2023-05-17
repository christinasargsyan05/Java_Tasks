package homeworkForBankAccount;

import enums.AccountType;


import java.util.ArrayList;

public class Bank {
    static  ArrayList< BankAccount > accounts = new ArrayList <> ();
    public static ArrayList<BankAccount> getBankAccounts(){return accounts;}

    /*
    public Bank() {
        accounts = new ArrayList < BankAccount > ();
    }
    */

    public static BankAccount openAccount(String ownerName, AccountType accountType){
        //accounts.add(account);
        BankAccount obj = new BankAccount(ownerName,accountType);
        accounts.add(obj);
        return obj;
    }
    public static void closeAccount(Account account){
        accounts.remove(account);
    }
    public static BankAccount getAccount(String accountNumber){
        boolean isTrue= false;
        for(BankAccount account :accounts){
            if(account.getAccountNumber().equalsIgnoreCase(accountNumber)){
                return account;
            }
        }
        return null;
    }
    public double getTotalBalance(double balance){
        double total =0.0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public static int getNumberOfAccounts(){
        return accounts.size();
    }



}
