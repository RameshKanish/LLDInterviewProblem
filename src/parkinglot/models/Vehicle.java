package parkinglot.models;

public abstract class Vehicle {
    private String licensePlate;
    private VehicleType type;
    private ParkingFeeStrategy parkingFeeStrategy;

    public Vehicle(String licensePlate , VehicleType type , ParkingFeeStrategy parkingFeeStrategy){
        this.licensePlate = licensePlate;
        this.type = type;
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getType() {
        return this.type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public ParkingFeeStrategy getParkingFeeStrategy() {
        return parkingFeeStrategy;
    }

    public void setParkingFeeStrategy(ParkingFeeStrategy parkingFeeStrategy) {
        this.parkingFeeStrategy = parkingFeeStrategy;
    }
}