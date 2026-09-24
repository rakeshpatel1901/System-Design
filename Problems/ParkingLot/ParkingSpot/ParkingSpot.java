package ParkingSpot;

import Vehicle.Vehicle;

public abstract class ParkingSpot {
    private final int id;
    private final String spotType;
    private Vehicle vehicle;
    private boolean occupied;

    protected ParkingSpot(int id, String spotType) {
        this.id = id;
        this.spotType = spotType;
        this.vehicle = null;
        this.occupied = false;
    }

    public int getId() {
        return id;
    }

    public String getSpotType() {
        return spotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isVacant() {
        return !occupied;
    }

    public boolean canFit(Vehicle v) {
        return v != null && spotType.equalsIgnoreCase(v.requiredSpotType());
    }

    public void occupy(Vehicle v) {
        this.vehicle = v;
        this.occupied = true;
    }

    public void vacate() {
        this.vehicle = null;
        this.occupied = false;
    }
}
