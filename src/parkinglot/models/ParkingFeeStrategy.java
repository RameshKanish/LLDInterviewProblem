package parkinglot.models;

public interface ParkingFeeStrategy {
    double calculateFee(String vehicleType , int durations , DurationType durationType);
}