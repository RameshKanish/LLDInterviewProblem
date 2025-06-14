package parkinglot.models;

public class LicensePlateRetrival implements RetrievalStrategy{
    @Override
    public Vehicle retrive(Request request , ParkingSlot parkingSlot) {
            if(parkingSlot.getVehicle().getLicensePlate().equals(request.licensePlate)) {
                return parkingSlot.getVehicle();
            }
        return null;
    }
}
