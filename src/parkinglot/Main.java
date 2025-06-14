package parkinglot;

import parkinglot.models.*;
import parkinglot.factory.VehicleFactory;
import parkinglot.statergy.BasicHourlyRateStrategy;
import parkinglot.statergy.UPIPaymentStategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Valet valet1 = new Valet("Ramesh ");
        Valet valet2 = new Valet("Ramesh ");
        Valet valet3 = new Valet("Ramesh ");

        List<Valet> valetsList = new ArrayList<>();
        valetsList.add(valet1);
        valetsList.add(valet2);
        valetsList.add(valet3);

        ValetManagement valetManagement = new ValetManagement(valetsList);

        List<ParkingSlot> slot = new ArrayList<>();

        slot.add(new ParkingSlot(1 , VehicleType.BUS));
        slot.add(new ParkingSlot(5 , VehicleType.CAR));
        slot.add(new ParkingSlot(4 , VehicleType.TRUCK));

        slot.sort((a,b)-> a.getParkingNumber() - b.getParkingNumber());

        ParkingLot lot = new ParkingLot(slot);
        ParkingFeeStrategy parkingFeeStrategy = new BasicHourlyRateStrategy();

        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleType.CAR , "TN69 R 5173", parkingFeeStrategy);
        Vehicle vehicle3 = VehicleFactory.createVehicle(VehicleType.CAR , "TN69 R 5174", parkingFeeStrategy);

        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleType.BUS , "TN78 R 7777", parkingFeeStrategy);

        ParkingSlot slot1 = lot.parkVehicle(vehicle1,valetManagement);
        PaymentStatergy ps = new UPIPaymentStategy();

        Payment payment = new Payment(100.00 , ps);

        Request request = new Request();
        request.setLicensePlate(vehicle1.getLicensePlate());

        RetrievalStrategy rs = new LicensePlateRetrival();
        RetrievalContext context = new RetrievalContext(rs);

        Vehicle vehicle = context.retriveVehicle(request , slot1);

        System.out.println(vehicle.getLicensePlate());
//        lot.vacateSpot(slot1 , vehicle1 , payment , request);

//        lot.parkVehicle(vehicle2);
//        lot.parkVehicle(vehicle3);


        lot.getAllParkedVehicle();

    }
}