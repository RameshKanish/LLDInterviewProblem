package parkinglot.models;

public class Ticket {
    int ticketNumber;

    public Ticket(int ticketNumber ){
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
