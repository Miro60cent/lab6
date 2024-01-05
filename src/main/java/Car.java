public class Car {
    private final String make;
    private final String model;
    private int year;
    private double cost;
    private double fuelEfficiency;
    private int maxSpeed;

    public Car(String make, String model, int year, double cost, double fuelEfficiency, int maxSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.cost = cost;
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
