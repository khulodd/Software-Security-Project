import java.util.ArrayList;

class CarRental {

  public ArrayList<Car> cars;
  private double gasPrice;

  public CarRental() {
    cars = new ArrayList<Car>();
    gasPrice = 2.25;
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public ArrayList<Car> getCars() {
    return cars;
  }

  public double getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(double gasPrice) {
    this.gasPrice = gasPrice;
  }

  //suitable cars method
  public ArrayList<Car> findSuitableCars(int numPassengers, int numDays, int mileage) {
    ArrayList<Car> suitableCars = new ArrayList<Car>();
    for (Car car : cars) {
      if (car.getMaxPassengers() >= numPassengers) {
        double rentalCost = 0;
        double mileageCost = mileage * gasPrice / car.getMaxPassengers();

        if (car.getCatagory().equals("Coupe")) {
          rentalCost = 45 * numDays;
          if (numPassengers <= 4) suitableCars.add(car);
        } else if (
          car.getCatagory().equals("Sedan") ||
          car.getCatagory().equals("Hybrid")
        ) {
          rentalCost = 50 * numDays;
          if (numPassengers <= 4) suitableCars.add(car);
        } else if (
          car.getCatagory().equals("Truck") ||
          car.getCatagory().equals("Crossover") ||
          car.getCatagory().equals("SUV")
        ) {
          rentalCost = 55 * numDays;
          if (numPassengers <= 5) suitableCars.add(car);
        } else if (car.getCatagory().equals("Van/Minivan")) {
          rentalCost = 70 * numDays;
          if (numPassengers <= 7) suitableCars.add(car);
        }

        double totalCost = rentalCost + mileageCost;

        if (totalCost <= 50) {
          suitableCars.add(car);
        }
      }
    }

    return suitableCars;
  }
}
