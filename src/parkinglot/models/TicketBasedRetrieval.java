package parkinglot.models;

public class TicketBasedRetrieval implements RetrievalStrategy{

    @Override
    public Vehicle retrive(Request request , ParkingSlot parkingSlot) {
        ParkingSlot slot = parkingSlot;
        return slot != null ? slot.getVehicle() : null;
    }
}