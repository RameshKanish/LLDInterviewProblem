package parkinglot.statergy;

import parkinglot.models.DurationType;
import parkinglot.models.ParkingFeeStrategy;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateFee(String vehicleType, int durations, DurationType durationType) {
        switch (vehicleType.toLowerCase()){
            case "car":
                return durations * durationType.getRate();
            case "bus":
                return durations * durationType.getRate();
            default:
                return 0;
        }
    }
}