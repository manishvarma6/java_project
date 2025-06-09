import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void openAccount(String name, String accNumber, double initialDeposit) {
        Account acc = new Account(name, accNumber, initialDeposit);
        accounts.add(acc);
        System.out.println("Account created successfully.");
    }

    public Account findAccount(String accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNumber)) {
                return acc;
            }
        }
        return null;
    }
}
