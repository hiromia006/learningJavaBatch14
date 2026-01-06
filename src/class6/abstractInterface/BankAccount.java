package class6.abstractInterface;

public class BankAccount {

    // private data (hidden from outside)
    private String accountNumber;
    private double balance;

    public BankAccount() {

    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // public setters to modify private data
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // public getters to access private data
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


}
