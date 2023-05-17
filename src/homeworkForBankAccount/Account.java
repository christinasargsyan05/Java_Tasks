package homeworkForBankAccount;

public interface Account {

    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    boolean balance ();
    String getAccountNumber();
    String getOwnerName();

    String toString();

}
