package parkinglotPractise.models;

import java.util.List;

public class ParkingLot {
    private List<Floors> floors;
    private EntryGate entryGates;
    private ExitGate exitGates;

    public ParkingLot(List<Floors> floors, EntryGate entryGates, ExitGate exitGates) {
        this.floors = floors;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
    }

    public ParkingSlot getAvailableParkingSlot(VehicleType vehicleType){
        for(Floors floors1 : floors){
            List<ParkingSlot> slots = floors1.getParkingSlots();
            for(ParkingSlot slot : slots){
                if(slot.iSpotAvailable && slot.getVehicleType().equals(vehicleType)){
                    return slot;
                }
            }
        }
        return null;
    }
    public void getAllFloors(){
        for(Floors fl : floors){
            List<ParkingSlot> slots = fl.getParkingSlots();
            for(ParkingSlot slot : slots){
                System.out.println("Slot id " + slot.getSlotNumber() + "Vehicle Type " + slot.getVehicleType());
            }
        }
    }
}