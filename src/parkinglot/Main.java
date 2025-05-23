package parkinglot;

import parkinglot.models.*;
import parkinglot.factory.VehicleFactory;
import parkinglot.statergy.BasicHourlyRateStrategy;
import parkinglot.statergy.UPIPaymentStategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSlot> slot = new ArrayList<>();

        slot.add(new ParkingSlot(1 , VehicleType.BUS));
        slot.add(new ParkingSlot(5 , VehicleType.CAR));
//        slot.add(new ParkingSlot(3 , VehicleType.CAR));
        slot.add(new ParkingSlot(4 , VehicleType.TRUCK));

        slot.sort((a,b)-> a.getParkingNumber() - b.getParkingNumber());

        ParkingLot lot = new ParkingLot(slot);
        ParkingFeeStrategy parkingFeeStrategy = new BasicHourlyRateStrategy();

        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleType.CAR , " TN69 R 5173", parkingFeeStrategy);
        Vehicle vehicle3 = VehicleFactory.createVehicle(VehicleType.CAR , " TN69 R 5174", parkingFeeStrategy);

        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleType.BUS , " TN78 R 7777", parkingFeeStrategy);


        ParkingSlot slot1 = lot.parkVehicle(vehicle1);
        PaymentStatergy ps = new UPIPaymentStategy();
        lot.vacateSpot(slot1 , vehicle1 , ps , 100.00);

//        lot.parkVehicle(vehicle2);
//        lot.parkVehicle(vehicle3);


        lot.getAllParkedVehicle();

    }
}