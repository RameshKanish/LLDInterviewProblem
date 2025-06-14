package parkinglotPractise.models;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ParkingSlot> parkingSlots = List.of(
                new ParkingSlot(1,VehicleType.CAR),
                new ParkingSlot(2,VehicleType.TRUCK),
                new ParkingSlot(3,VehicleType.CAR)
        );

        List<Floors> floors = new ArrayList<>();
        Floors floors1 = new Floors(parkingSlots);

        floors.add(floors1);

        Vehicle vehicle1 = new Vehicle("TN 69 34", VehicleType.CAR);
        Vehicle vehicle2 = new Vehicle("TN 69 34", VehicleType.TRUCK);

        EntryGate entryGate = new EntryGate(1 ,"Ramesh");
        ExitGate exitGate = new ExitGate(2 , "Kanishkar");

        ParkingLot parkingLot = new ParkingLot(floors , entryGate , exitGate);

//        parkingLot.getAllFloors();


        Ticket ticket = entryGate.generateTicket(vehicle1 , parkingLot);


//        System.out.println(ticket);
    }
}