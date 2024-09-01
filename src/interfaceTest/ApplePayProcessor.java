package interfaceTest;

public class ApplePayProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Apple Pay 를 결제합니다");
    }
}
