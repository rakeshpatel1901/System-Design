package Strategy.Payment;

public class UPI implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Amount paid using UPI: " + amount);
    }
}
