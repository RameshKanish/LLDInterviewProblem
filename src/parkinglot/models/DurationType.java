package parkinglot.models;

public enum DurationType {
    HOURS(10.0),
    MINUTES(0.5);

    private final double rate;
    DurationType(double rate){
        this.rate = rate;
    }
    public double getRate(){
        return this.rate;
    }
}