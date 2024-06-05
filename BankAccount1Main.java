
abstract class BankAccount1 {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount1 extends BankAccount {
    double balance;

    SavingsAccount1() {
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in savings account");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from savings account");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount1 extends BankAccount {
    double balance;

    CurrentAccount1() {
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in current account");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from current account");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankAccount1Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        savings.deposit(1000);
        savings.withdraw(500);

        current.deposit(2000);
        current.withdraw(1000);
    }
}
