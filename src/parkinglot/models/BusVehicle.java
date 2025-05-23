package parkinglot.models;

public class BusVehicle extends Vehicle{
    public BusVehicle(String licensePlate, VehicleType type, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, VehicleType.BUS, parkingFeeStrategy);
    }
}