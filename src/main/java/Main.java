import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Camry", 2022, 25000, 30, 150, 12000);
        Hatchback hatchback = new Hatchback("Ford", "Focus", 2023, 20000, 25, 140, 14000);
        SportsCar sportsCar = new SportsCar("Porsche", "911", 2023, 100000, 15, 200,15000);

        List<Car> cars = List.of(sedan, hatchback, sportsCar);
        TaxiPark taxiPark = new TaxiPark(cars);

        System.out.println("Total Fleet Cost: " + taxiPark.calculateFleetCost());

        List<Car> sortedCars = taxiPark.sortByFuelEfficiency();
        System.out.println("\nCars Sorted by Fuel Efficiency:");
        for (Car car : sortedCars) {
            System.out.println(car.getMake() + " " + car.getModel() + " - Fuel Efficiency: " + car.getFuelEfficiency());
        }

        int minSpeed = 140;
        int maxSpeed = 180;
        List<Car> matchingCars = taxiPark.findCarsBySpeedRange(minSpeed, maxSpeed);
        System.out.println("\nCars in Speed Range (" + minSpeed + " - " + maxSpeed + "):");
        for (Car car : matchingCars) {
            System.out.println(car.getMake() + " " + car.getModel() + " - Max Speed: " + car.getMaxSpeed());
        }
    }
}
