package class6;

import class6.abstractInterface.BankAccount;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("--------------------------");
        account.setBalance(500);
        account.setAccountNumber("123456789");

        System.out.println("Balance after deposit: " + account.getBalance());
        account.setAccountNumber("987654321");
        System.out.println("Balance after withdrawal: " + account.getBalance());

        System.out.println("Final Account Number: " + account.getAccountNumber());

        System.out.println("--------------------------");
        BankAccount   account2 = new BankAccount("555666777", 1000);
        System.out.println("Account2 Number: " + account2.getAccountNumber());
        System.out.println("Account2 Initial Balance: " + account2.getBalance());



    }
}
