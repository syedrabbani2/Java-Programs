public class BankAccount {
    
    private String accountNumber;
    private double balance;

   
    public BankAccount(String accountNumber, double initialBalance) {
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

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("000001", 1000.0);

        
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); 

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
