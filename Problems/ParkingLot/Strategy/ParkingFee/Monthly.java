package Strategy.ParkingFee;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Monthly implements ParkingFeeStrategy {

    @Override
    public int getCost(String vehicleType, LocalDateTime inTime, LocalDateTime outTime) {
        long months = Math.max(1, ChronoUnit.MONTHS.between(inTime, outTime));
        return rateFor(vehicleType) * (int) months;
    }

    private int rateFor(String type) {
        if (type.equalsIgnoreCase("bike")) {
            return 2000;
        }
        if (type.equalsIgnoreCase("car")) {
            return 4000;
        }
        if (type.equalsIgnoreCase("truck")) {
            return 5000;
        }
        throw new IllegalArgumentException("This vehicle is not allowed: " + type);
    }
}
