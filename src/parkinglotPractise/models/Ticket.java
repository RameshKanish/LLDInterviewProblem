package parkinglotPractise.models;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    private String ticket_id;
    private Vehicle vehicle;

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    private Date entryTime;
    private Date exitTime;
    private ParkingSlot parkingSlot;

    Ticket(String ticketId ,Vehicle vehicle , ParkingSlot parkingSlot , Date entryTime){
        this.ticket_id = ticketId;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
    }
}