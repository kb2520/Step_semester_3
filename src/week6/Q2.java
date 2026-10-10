package main.java.week6;
class MessWallet {

    private double balance;

    // Constructor
    public MessWallet(double balance) {

        if (balance < 0) {
            System.out.println("Warning: Negative opening balance. Starting at 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void setBalance(double balance) {

        if (balance < 0) {
            System.out.println("Balance cannot be negative");
        } else {
            this.balance = balance;
        }
    }

    // Top-up
    public void topUp(double amount) {

        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be positive");
        } else {
            balance = balance + amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct
    public void deduct(double amount) {

        if (amount <= 0) {
            System.out.println("Deduction rejected: amount must be positive");
        } else if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Balance after deduction: " + balance);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);

        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());

        // Setter example
        wallet.setBalance(800);

        System.out.println("Balance after setter: " + wallet.getBalance());
    }
}
