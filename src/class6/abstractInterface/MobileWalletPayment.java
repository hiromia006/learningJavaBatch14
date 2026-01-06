package class6.abstractInterface;

public class MobileWalletPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Mobile Wallet.");

    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to Mobile Wallet.");

    }

    public void printPaymentMethod() {
        System.out.println("This is a Mobile Wallet Payment method.");
    }
}
