/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HONOR
 */
public class Car {

  private String carType, carModel, catagory, comfort;
  private int MaxPassengers;
  private int carPrice;

  public Car() {
    carType = "";
    carModel = "";
    carPrice = 0;
    MaxPassengers = 0;
    comfort = " ";
    catagory = " ";
  }

  Car(String ct, String cm, int cp, int mp, String com, String cat) {
    carType = ct;
    carModel = cm;
    carPrice = cp;
    MaxPassengers = mp;
    comfort = com;
    catagory = cat;
  }

  public void setCar( String cT, String cM, int cP, int cMP, String cC, String cCT){
    carType = cT;
    carModel = cM;
    carPrice = cP;
    MaxPassengers = cMP;
    comfort = cC;
    catagory = cCT;
  }

  public String getCarType() {
    return carType;
  }

  public String getCarModel() {
    return carModel;
  }

  public String getCar() {
    return getCarType() + "-" + getCarModel();
  }

  public double getCarPrice() {
    return carPrice;
  }

  public String getCatagory() {
    return catagory;
  }

  public void setCatagory(String catagory) {
    this.catagory = catagory;
  }

  public String getComfort() {
    return comfort;
  }

  public void setComfort(String comfort) {
    this.comfort = comfort;
  }

  public int getMaxPassengers() {
    return MaxPassengers;
  }

  public void setMaxPassengers(int MaxPassengers) {
    this.MaxPassengers = MaxPassengers;
  }
}
