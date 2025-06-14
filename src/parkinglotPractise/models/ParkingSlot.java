package parkinglotPractise.models;

public class ParkingSlot {
    private int slotNumber;
    private VehicleType vehicleType;
    boolean iSpotAvailable;

    public ParkingSlot(int slotNumber , VehicleType vehicleType){
        this.slotNumber = slotNumber;
        this.vehicleType = vehicleType;
        this.iSpotAvailable = true;
    }
    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isiSpotAvailable() {
        return iSpotAvailable;
    }

    public void setiSpotAvailable(boolean iSpotAvailable) {
        this.iSpotAvailable = iSpotAvailable;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    private Vehicle parkedVehicle;
}