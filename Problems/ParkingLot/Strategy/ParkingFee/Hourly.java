package Strategy.ParkingFee;

import java.time.Duration;
import java.time.LocalDateTime;

public class Hourly implements ParkingFeeStrategy {

    @Override
    public int getCost(String vehicleType, LocalDateTime inTime, LocalDateTime outTime) {
        long hours = Math.max(1, Duration.between(inTime, outTime).toHours());
        return rateFor(vehicleType) * (int) hours;
    }

    private int rateFor(String type) {
        if (type.equalsIgnoreCase("bike")) {
            return 20;
        }
        if (type.equalsIgnoreCase("car")) {
            return 40;
        }
        if (type.equalsIgnoreCase("truck")) {
            return 50;
        }
        throw new IllegalArgumentException("This vehicle is not allowed: " + type);
    }
}
