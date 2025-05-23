package parkinglot.factory;

import parkinglot.models.*;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType , String licensePlate , ParkingFeeStrategy parkingFeeStrategy){
        if(vehicleType == VehicleType.CAR){
            return new CarVehicle(licensePlate , vehicleType , parkingFeeStrategy);
        }else if(vehicleType == VehicleType.BUS){
            return new BusVehicle(licensePlate , vehicleType , parkingFeeStrategy);
        }
        return null;
    }
}