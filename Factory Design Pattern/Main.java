import FactoryPackage.VehicleFactory;
import Module.*;
public class Main {
    public static void main(String args[]){
        Vehicle v1 = VehicleFactory.createVehicle("TwoWheeler");
        v1.start();
        v1.stop();
        Vehicle v2 = VehicleFactory.createVehicle("FourWheeler");
        v2.start();
        v2.stop();
    }
}
