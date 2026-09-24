package Vehicle;

public class Car extends Vehicle {
    public Car(String vNo, String vType) {
        super(vNo, vType);
    }

    @Override
    public String requiredSpotType() {
        return "four";
    }
}
