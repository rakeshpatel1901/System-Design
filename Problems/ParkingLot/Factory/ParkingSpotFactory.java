package Factory;

import ParkingSpot.FourWheelParkingSpot;
import ParkingSpot.ParkingSpot;
import ParkingSpot.TwoWheelParkingSpot;

public class ParkingSpotFactory {

    public static ParkingSpot getParkingSpot(int id, String spotType) {
        if (spotType.equalsIgnoreCase("two")) {
            return new TwoWheelParkingSpot(id, spotType);
        }
        if (spotType.equalsIgnoreCase("four")) {
            return new FourWheelParkingSpot(id, spotType);
        }
        throw new IllegalArgumentException("Not able to create this parking spot: " + spotType);
    }
}
