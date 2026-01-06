package class6.abstractInterface;

public class AbstractionInterface {
    public static void main(String[] args) {
        CreditCardPayment paymentMethod = new CreditCardPayment();
        paymentMethod.pay(100.0);      // Output: Paid $100.0 using Credit Card.
        paymentMethod.refund(50.0);    // Output: Refunded $50.0 to Credit Card.
        paymentMethod.printPaymentMethod();

        MobileWalletPayment walletPayment = new MobileWalletPayment();
        walletPayment.pay(75.0);       // Output: Paid $75.0 using Mobile Wallet.
        walletPayment.refund(25.0);    // Output: Refunded $
        walletPayment.printPaymentMethod();

        // parent class or abstract class or interface reference can hold child class object
        Payment payment1 = new CreditCardPayment();
        payment1.pay(200.0);           // Output: Paid $200.0 using Credit Card.
        payment1.refund(100.0);       // Output: Refunded $100.0 to Credit Card.

    }
}
