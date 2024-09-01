package interfaceTest;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor pay = new ApplePayProcessor();
        pay.processPayment();
        pay = new CreditCardProcessor();
        pay.processPayment();
        pay = new PaypalProcessor();
        pay.processPayment();
    }
}
