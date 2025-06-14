package parkinglot.models;

public class Valet {
    String name;
    Vehicle vehicle;
    boolean isAvailable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Valet(String name){
        this.name = name;
        this.vehicle = null;
        this.isAvailable = true;
    }
}