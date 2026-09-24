package Strategy.ParkingFee;

import java.time.Duration;
import java.time.LocalDateTime;

public class Day implements ParkingFeeStrategy {

    @Override
    public int getCost(String vehicleType, LocalDateTime inTime, LocalDateTime outTime) {
        long days = Math.max(1, Duration.between(inTime, outTime).toDays());
        return rateFor(vehicleType) * (int) days;
    }

    private int rateFor(String type) {
        if (type.equalsIgnoreCase("bike")) {
            return 200;
        }
        if (type.equalsIgnoreCase("car")) {
            return 400;
        }
        if (type.equalsIgnoreCase("truck")) {
            return 500;
        }
        throw new IllegalArgumentException("This vehicle is not allowed: " + type);
    }
}
