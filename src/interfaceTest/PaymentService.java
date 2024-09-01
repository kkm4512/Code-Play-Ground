package interfaceTest;

public class PaymentService {
    public static PaymentProcessor paymentChoice(String paymentMethod){
        switch (paymentMethod.toLowerCase()) {
            case "creditcard":
                return new CreditCardProcessor();
            case "applepay":
                return new ApplePayProcessor();
            case "paypal":
                return new PaypalProcessor();
            default:
                throw new IllegalArgumentException("지원되지 않는 결제 방식입니다: " + paymentMethod);
        }
    }

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = paymentChoice("applepay");
        paymentProcessor.processPayment();
    }
}
