public class BankAccount {
    private double balance;

    // constructor
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }

        balance += amount;
    }

    // withdraw money
    public void withdraw(double amount) {

        // ❗ INTENTIONAL BUG:
        // allows withdrawing equal or more than balance
        if (amount <=0) {
            throw new IllegalArgumentException("Withdraw must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= amount;
    }

    // get balance
    public double getBalance() {
        return balance;
    }
}
