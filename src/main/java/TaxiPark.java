import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiPark {
    private List<Car> cars;

    public TaxiPark(List<Car> cars) {
        this.cars = cars;
    }

    public double calculateFleetCost() {
        return cars.stream().mapToDouble(Car::getCost).sum();
    }

    public List<Car> sortByFuelEfficiency() {
        List<Car> sortedCars = new ArrayList<>(cars);
        sortedCars.sort(Comparator.comparingDouble(Car::getFuelEfficiency));
        return sortedCars;
    }

    public List<Car> findCarsBySpeedRange(int minSpeed, int maxSpeed) {
        List<Car> matchingCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                matchingCars.add(car);
            }
        }
        return matchingCars;
    }
}
