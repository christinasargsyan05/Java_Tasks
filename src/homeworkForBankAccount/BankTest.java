package homeworkForBankAccount;

import enums.AccountType;
import static homeworkForBankAccount.Bank.*;

public class BankTest {
    public static void main(String[] args)
    {
        final BankAccount account1=Bank.openAccount("Test", AccountType.SAVINGS);
        final BankAccount account2= Bank.openAccount("test1", AccountType.CHECKING);
        System.out.println(getAccount("1").toString());
        System.out.println(getAccount("0").toString());
    }
}
