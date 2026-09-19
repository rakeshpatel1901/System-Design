import Strategy.NormalDrive;
import Strategy.SportsDrive;

public class Main{
    public static void main(String args[]){
        Vehicle v1 = new OffRoadVehicle(new SportsDrive());
        Vehicle v2 = new SportsVehicle(new SportsDrive());
        Vehicle v3 = new OrdinaryVehicle(new NormalDrive());
        v1.drive();
        v2.drive();
        v3.drive();
    }
}
