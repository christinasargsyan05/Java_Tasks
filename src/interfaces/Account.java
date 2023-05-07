package interfaces;

public interface Account {

    double getBalance();
    double deposit(double amount);
    double withdraw(double amount);
    boolean balance ();
    String getAccountNumber();
    String getOwnerName();

    String toString();

}
