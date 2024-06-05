public class BankAccountMain2 {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("123456789", 1000.0);
        
        // Accessing private member variables using accessor methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());
        
        // Deposit and withdraw money
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); // This should fail due to insufficient balance
        
        // Display updated balance
        System.out.println("Current Balance: $" + account.getBalance());
    }
}

class BnkAccount {
    
    private String accountNumber;
    private double balance;

   
    public BnkAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

   
    public double getBalance() {
        return balance;
    }
}
