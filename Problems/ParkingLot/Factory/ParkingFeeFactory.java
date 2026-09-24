package Factory;

import Strategy.ParkingFee.Day;
import Strategy.ParkingFee.Hourly;
import Strategy.ParkingFee.Monthly;
import Strategy.ParkingFee.ParkingFeeStrategy;

public class ParkingFeeFactory {
    public static ParkingFeeStrategy getInstance(String type) {
        if (type.equalsIgnoreCase("hour") || type.equalsIgnoreCase("hourly")) {
            return new Hourly();
        }
        if (type.equalsIgnoreCase("day") || type.equalsIgnoreCase("daily")) {
            return new Day();
        }
        if (type.equalsIgnoreCase("month") || type.equalsIgnoreCase("monthly")) {
            return new Monthly();
        }
        throw new IllegalArgumentException("This parking fee strategy is not present: " + type);
    }
}
