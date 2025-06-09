import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Open Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double deposit = sc.nextDouble();
                    bank.openAccount(name, accNum, deposit);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String accToView = sc.nextLine();
                    Account acc1 = bank.findAccount(accToView);
                    if (acc1 != null)
                        acc1.displayAccountDetails();
                    else
                        System.out.println("Account not found!");
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String accToDeposit = sc.nextLine();
                    Account acc2 = bank.findAccount(accToDeposit);
                    if (acc2 != null) {
                        System.out.print("Enter deposit amount: ");
                        acc2.deposit(sc.nextDouble());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String accToWithdraw = sc.nextLine();
                    Account acc3 = bank.findAccount(accToWithdraw);
                    if (acc3 != null) {
                        System.out.print("Enter withdrawal amount: ");
                        acc3.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the bank!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
