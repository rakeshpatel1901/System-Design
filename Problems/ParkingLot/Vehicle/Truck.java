package Vehicle;

public class Truck extends Vehicle {
    public Truck(String vNo, String vType) {
        super(vNo, vType);
    }

    @Override
    public String requiredSpotType() {
        return "four";
    }
}
