/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *public class Admin {
    
 }
 
 *
 *
 * @author HONOR
 */
import java.util.*;

public class Admin {

  private HashMap<String, String> loginInfo;
  private CarRental carRental;

  public Admin() {
    loginInfo = new HashMap<>();
    loginInfo.put("Admin", "password123");
    loginInfo.put("user1", "password456");
    loginInfo.put("user2", "password789");
  }

  Admin(Car carEconomy, Car carIntermediate, Car carStandard, Car carVan) {
    loginInfo = new HashMap<>();
    loginInfo.put("Admin", "password123");
    loginInfo.put("user1", "password456");
    loginInfo.put("user2", "password789");
    carRental = new CarRental();
    carRental.addCar(carEconomy);
    carRental.addCar(carIntermediate);
    carRental.addCar(carStandard);
    carRental.addCar(carVan);
  }

  public HashMap<String, String> getLoginInfo() {
    return loginInfo;
  }

  public boolean login(String username, String password) {
    if (loginInfo.containsKey(username) && loginInfo.get(username).equals(password)) {
      return true;
    }
    return false;
  }

  public Admin(CarRental carRental) {
    this.carRental = carRental;
  }

  public void Options() {
    System.out.println("1. Edit car economy price: " + carRental.getCars().get(0).getCar());
    System.out.println("2. Edit car intermediate price: " + carRental.getCars().get(1).getCar());
    System.out.println("3. Edit car standard price: " + carRental.getCars().get(2).getCar());
    System.out.println("4. Edit car van price: " + carRental.getCars().get(3).getCar());
    System.out.println("5. Exit");
  }

  public void suitableCars() {}
}
