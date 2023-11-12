/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HONOR
 */
import java.util.*;

public class User {

  private int mileage;
  private int NumOfpassnger;
  private int rentalDays;
  private double TotalPrice;
  private CarRental carRental;

  public User(int miles, int rentalDays, double TotalPrice) {
    this.mileage = miles;
    this.rentalDays = rentalDays;
    this.TotalPrice = TotalPrice;
  }

  User(int rentalDays, int passenger, int mileage,Car carEconomy,Car carIntermediate,Car carStandard,Car carVan) {
    this.NumOfpassnger = passenger;
    this.mileage = mileage;
    this.rentalDays = rentalDays;
    carRental = new CarRental();
    carRental.addCar(carEconomy);
    carRental.addCar(carIntermediate);
    carRental.addCar(carStandard);
    carRental.addCar(carVan);
  }

  public double MileageCost(double mileage) {
    final double GAS_PRICE = 2.25;
    return mileage * GAS_PRICE;
  }

  public void findSuitableCars() {
    ArrayList<Car> suitableCars = carRental.findSuitableCars(
      this.NumOfpassnger,
      this.rentalDays,
      this.mileage
    );
    if (suitableCars.size() > 0) {
      System.out.println("Suitable cars for rental:");
      for (Car car : suitableCars) {
        System.out.println(
          "Make and Model: " +
          car.getCar() +
          ", Price: " +
          car.getCarPrice() +
          ", Passengers: " +
          car.getMaxPassengers()
        );
      }
    } else {
      System.out.println("Sorry, no suitable cars available for rental.");
    }
  }
}
