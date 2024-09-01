package interfaceTest;

public class PaypalProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("페이팔로 결제합니다");
    }
}
