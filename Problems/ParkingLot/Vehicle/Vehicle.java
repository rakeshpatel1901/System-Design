package Vehicle;

public abstract class Vehicle {
    private final String vNo;
    private final String vType;

    protected Vehicle(String vNo, String vType) {
        this.vNo = vNo;
        this.vType = vType;
    }

    public String getVNo() {
        return vNo;
    }

    public String getVType() {
        return vType;
    }

    public abstract String requiredSpotType();
}
