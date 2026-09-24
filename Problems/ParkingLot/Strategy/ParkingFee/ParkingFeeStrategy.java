package Strategy.ParkingFee;

import java.time.LocalDateTime;

public interface ParkingFeeStrategy {
    int getCost(String vehicleType, LocalDateTime inTime, LocalDateTime outTime);
}
