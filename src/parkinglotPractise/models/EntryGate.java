package parkinglotPractise.models;

import java.util.Date;
import java.util.UUID;

public class EntryGate {
    private int gateId;
    private String operatorName;

    public EntryGate(int gateId , String operatorName){
        this.gateId = gateId;
        this.operatorName = operatorName;
    }

    public Ticket generateTicket(Vehicle vehicle , ParkingLot parkingLot){
        ParkingSlot slot = parkingLot.getAvailableParkingSlot(vehicle.getVehicleType());
        if(slot == null){
            System.out.println("No slot is available for this vehicle Type " + vehicle.getVehicleType());
            return null;
        }
        slot.setiSpotAvailable(false);
        slot.setParkedVehicle(vehicle);


        String uuid = UUID.randomUUID().toString();

        Ticket ticket = new Ticket(uuid , vehicle , slot , new Date());

        System.out.println("Ticket is generated for this Vehicle " + vehicle.getNumberPlate() +
                "Slot is  " + slot.getSlotNumber() +
                "Ticket id is this "+ ticket.getTicket_id()
        );
        return ticket;
    }
}