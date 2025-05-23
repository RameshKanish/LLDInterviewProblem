package parkinglot.models;

public class CarVehicle extends Vehicle{

    public CarVehicle(String licensePlate, VehicleType type, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, type, parkingFeeStrategy);
    }
}