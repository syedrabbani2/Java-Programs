abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    void deposit(double amount) {
        System.out.println("Depositing $" + amount + " into Savings Account...");
    }

    void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + " from Savings Account...");
    }
}

class CurrentAccount extends BankAccount {
    void deposit(double amount) {
        System.out.println("Depositing $" + amount + " into Current Account...");
    }

    void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + " from Current Account...");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount();
        BankAccount currentAccount = new CurrentAccount();

        // Invoking abstract methods
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);

        currentAccount.deposit(2000);
        currentAccount.withdraw(1000);
    }
}
