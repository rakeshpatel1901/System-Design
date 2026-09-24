package Factory;

import Vehicle.Bike;
import Vehicle.Car;
import Vehicle.Truck;
import Vehicle.Vehicle;

public class VehicleFactory {

    public static Vehicle getInstance(String vNo, String vType) {
        if (vType.equalsIgnoreCase("bike")) {
            return new Bike(vNo, vType);
        }
        if (vType.equalsIgnoreCase("car")) {
            return new Car(vNo, vType);
        }
        if (vType.equalsIgnoreCase("truck")) {
            return new Truck(vNo, vType);
        }
        throw new IllegalArgumentException("This vehicle is not supported: " + vType);
    }
}
