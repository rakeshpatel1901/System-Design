import Factory.ParkingFeeFactory;
import Factory.ParkingSpotFactory;
import Factory.PaymentFactory;
import Factory.VehicleFactory;
import ParkingSpot.ParkingSpot;
import Strategy.ParkingFee.ParkingFeeStrategy;
import Strategy.Payment.PaymentStrategy;
import Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        ParkingSpot twoWheeler1 = ParkingSpotFactory.getParkingSpot(1, "two");
        ParkingSpot twoWheeler2 = ParkingSpotFactory.getParkingSpot(2, "two");
        ParkingSpot fourWheeler1 = ParkingSpotFactory.getParkingSpot(3, "four");
        ParkingSpot fourWheeler2 = ParkingSpotFactory.getParkingSpot(4, "four");

        parkingLot.addSpot(twoWheeler1);
        parkingLot.addSpot(twoWheeler2);
        parkingLot.addSpot(fourWheeler1);
        parkingLot.addSpot(fourWheeler2);

        Vehicle bike = VehicleFactory.getInstance("MH14GH0683", "bike");
        Vehicle car = VehicleFactory.getInstance("MH12AB0395", "car");
        Vehicle truck = VehicleFactory.getInstance("MH21HF1234", "truck");

        ParkingFeeStrategy hourly = ParkingFeeFactory.getInstance("hourly");
        ParkingFeeStrategy daily = ParkingFeeFactory.getInstance("daily");
        ParkingFeeStrategy monthly = ParkingFeeFactory.getInstance("monthly");

        Ticket bikeTicket = parkingLot.park(bike, hourly);
        Ticket carTicket = parkingLot.park(car, daily);
        Ticket truckTicket = parkingLot.park(truck, monthly);

        System.out.println("Parked bike at spot " + bikeTicket.getParkingSpot().getId());
        System.out.println("Parked car at spot " + carTicket.getParkingSpot().getId());
        System.out.println("Parked truck at spot " + truckTicket.getParkingSpot().getId());

        PaymentStrategy cash = PaymentFactory.getPaymentInstance("cash");
        PaymentStrategy upi = PaymentFactory.getPaymentInstance("upi");

        parkingLot.payAndExit(bikeTicket, cash);
        parkingLot.payAndExit(carTicket, upi);

        Vehicle anotherBike = VehicleFactory.getInstance("MH14XY9999", "bike");
        Ticket anotherBikeTicket = parkingLot.park(anotherBike, hourly);
        System.out.println("Reused two-wheeler spot " + anotherBikeTicket.getParkingSpot().getId());
        parkingLot.payAndExit(anotherBikeTicket, cash);
        parkingLot.payAndExit(truckTicket, upi);
    }
}
