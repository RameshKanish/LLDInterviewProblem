package parkinglot.models;

public interface RetrievalStrategy {
    Vehicle retrive(Request request , ParkingSlot parkingSlot);
}