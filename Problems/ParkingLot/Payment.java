import Strategy.Payment.PaymentStrategy;

public class Payment {
    private final PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
