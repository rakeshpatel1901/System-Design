import ParkingSpot.ParkingSpot;
import Strategy.ParkingFee.ParkingFeeStrategy;
import Strategy.Payment.PaymentStrategy;
import Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<ParkingSpot> spots;

    private ParkingLot() {
        spots = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addSpot(ParkingSpot parkingSpot) {
        spots.add(parkingSpot);
    }

    public void removeSpot(ParkingSpot parkingSpot) {
        spots.remove(parkingSpot);
    }

    public boolean hasVacantSpot(Vehicle v) {
        return findParkingSpot(v) != null;
    }

    public ParkingSpot findParkingSpot(Vehicle v) {
        for (ParkingSpot ps : spots) {
            if (ps.isVacant() && ps.canFit(v)) {
                return ps;
            }
        }
        return null;
    }

    public Ticket park(Vehicle v, ParkingFeeStrategy parkingFeeStrategy) {
        ParkingSpot ps = findParkingSpot(v);
        if (ps == null) {
            throw new IllegalStateException("No parking spot left for vehicle type: " + v.getVType());
        }
        ps.occupy(v);
        return new Ticket(v, ps, parkingFeeStrategy, LocalDateTime.now());
    }

    public int payAndExit(Ticket ticket, PaymentStrategy paymentStrategy) {
        if (ticket == null || ticket.isClosed()) {
            throw new IllegalStateException("Invalid or already closed ticket");
        }
        int amount = ticket.calculateFee();
        new Payment(paymentStrategy).pay(amount);
        ticket.getParkingSpot().vacate();
        ticket.close();
        return amount;
    }
}
