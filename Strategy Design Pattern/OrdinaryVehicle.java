import Strategy.DriveStrategy;
import Strategy.NormalDrive;

public class OrdinaryVehicle extends  Vehicle{

    public OrdinaryVehicle(DriveStrategy strategy){
        super(strategy);
    }
}