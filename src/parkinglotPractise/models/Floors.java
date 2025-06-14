package parkinglotPractise.models;


import java.util.List;
import java.util.Map;

public class Floors {
    private List<ParkingSlot> parkingSlots;

    public Floors(List<ParkingSlot> parkingSlots){
        this.parkingSlots = parkingSlots;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Map<VehicleType, List<Vehicle>> getVehicleTypeListMap() {
        return vehicleTypeListMap;
    }

    public void setVehicleTypeListMap(Map<VehicleType, List<Vehicle>> vehicleTypeListMap) {
        this.vehicleTypeListMap = vehicleTypeListMap;
    }

    private Map<VehicleType , List<Vehicle>> vehicleTypeListMap;
}