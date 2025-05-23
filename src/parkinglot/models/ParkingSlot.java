package parkinglot.models;

public class ParkingSlot {
    private int parkingNumber;
    private boolean isOccupied;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private VehicleType slotType;
    private Vehicle vehicle;

    public int getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(int parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public VehicleType getSlotType() {
        return slotType;
    }

    public void setSlotType(VehicleType slotType) {
        this.slotType = slotType;
    }

    public ParkingSlot(int parkingNumber , VehicleType vehicleType){
        this.parkingNumber = parkingNumber;
        this.slotType = vehicleType;
        this.isOccupied = false;
    }

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            throw new IllegalStateException("Spot is already Filled");
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate(){
        if(!this.isOccupied){
            throw new IllegalStateException("The spot is already parked");
        }
        this.isOccupied = false;
        this.vehicle = null;
    }
}