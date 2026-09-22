package FactoryPackage;

import Module.*;

public class VehicleFactory {

    public static Vehicle createVehicle(String type){
        if(type.equalsIgnoreCase("TwoWheeler")){
            return new TwoWheeler();
        }
        else if(type.equalsIgnoreCase("ThreeWheeler")){
            return new ThreeWheeler();
        }
        else if(type.equalsIgnoreCase("FourWheeler")){
            return new FourWheeler();
        }
        else{
            throw new IllegalArgumentException("This Type is not determined");
        }
    }
}
