package Strategy.Payment;

public class Cash implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Amount paid using Cash: " + amount);
    }
}
