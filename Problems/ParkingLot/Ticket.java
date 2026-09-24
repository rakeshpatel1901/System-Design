import ParkingSpot.ParkingSpot;
import Strategy.ParkingFee.ParkingFeeStrategy;
import Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final ParkingFeeStrategy parkingFeeStrategy;
    private final LocalDateTime inTime;
    private LocalDateTime outTime;
    private boolean closed;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, ParkingFeeStrategy parkingFeeStrategy, LocalDateTime inTime) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.parkingFeeStrategy = parkingFeeStrategy;
        this.inTime = inTime;
        this.closed = false;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

    public boolean isClosed() {
        return closed;
    }

    public int calculateFee() {
        if (outTime == null) {
            outTime = LocalDateTime.now();
        }
        return parkingFeeStrategy.getCost(vehicle.getVType(), inTime, outTime);
    }

    public void close() {
        this.closed = true;
        if (outTime == null) {
            outTime = LocalDateTime.now();
        }
    }
}
