package interfaceTest;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("신용카드를 결제합니다");
    }
}
