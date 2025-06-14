package parkinglot.models;

public class RetrievalContext {

    public RetrievalStrategy retrievalStrategy;

    public RetrievalContext(RetrievalStrategy retrievalStrategy){
        this.retrievalStrategy = retrievalStrategy;
    }

    public Vehicle retriveVehicle(Request request , ParkingSlot parkingSlot){
        return retrievalStrategy.retrive(request, parkingSlot);
    }
}