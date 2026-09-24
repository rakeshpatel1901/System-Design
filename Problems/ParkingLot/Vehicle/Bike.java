package Vehicle;

public class Bike extends Vehicle {
    public Bike(String vNo, String vType) {
        super(vNo, vType);
    }

    @Override
    public String requiredSpotType() {
        return "two";
    }
}
