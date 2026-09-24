package Factory;

import Strategy.Payment.Cash;
import Strategy.Payment.PaymentStrategy;
import Strategy.Payment.UPI;

public class PaymentFactory {
    public static PaymentStrategy getPaymentInstance(String type) {
        if (type.equalsIgnoreCase("cash")) {
            return new Cash();
        }
        if (type.equalsIgnoreCase("upi")) {
            return new UPI();
        }
        throw new IllegalArgumentException("This payment option is not available: " + type);
    }
}
