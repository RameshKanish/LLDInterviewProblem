package parkinglot.models;

import java.util.Date;
import java.util.List;

public class ParkingLot {
    public List<ParkingSlot> slots;

    public ParkingLot(List<ParkingSlot> slots){
        this.slots = slots;
    }

    public ParkingSlot findAvailableSpot(VehicleType vehicleType){
        for(ParkingSlot parkingSlot : slots){
            if(!parkingSlot.isOccupied() && parkingSlot.getSlotType().equals(vehicleType)){
                return parkingSlot;
            }
        }
        return null;
    }

    public ParkingSlot parkVehicle(Vehicle vehicle){
        ParkingSlot slot = findAvailableSpot(vehicle.getType());

        if(slot != null){
            slot.parkVehicle(vehicle);
            return slot;
        }
        System.out.println("No Parking slot is available for this car" + vehicle.getLicensePlate());
        return null;
    }

    public void vacateSpot(ParkingSlot spot , Vehicle vehicle , PaymentStatergy payment , double amount){
        if(spot != null && spot.isOccupied() && spot.getVehicle().getType().equals(vehicle.getType())){
            spot.vacate();
            if(payment != null){
                payment.makePay(amount);
            }
            System.out.println(vehicle.getType() + " " +" vacated spot"  + spot.getParkingNumber());
        }else{
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }

    public ParkingSlot getSpotByNumber(int spotNumber){
        for(ParkingSlot slot : slots){
            if(slot != null && slot.getParkingNumber() == spotNumber){
                return slot;
            }
        }
        return null;
    }
    public void getAllParkedVehicle(){

        for(ParkingSlot slot : slots){
            if(slot.isOccupied()){
                System.out.println("The Vehicle Number" + slot.getVehicle().getLicensePlate()
                        + "And the Spot is " + slot.getParkingNumber());
            }
        }

    }
    public List<ParkingSlot> parkingSlots (){
        return slots;
    }
}