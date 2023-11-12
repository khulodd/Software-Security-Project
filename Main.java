import java.util.*;
import java.util.ArrayList;

public class Main {

  public static void login() throws Exception {
    // cars objects

    Car Van = new Car(
      "Van",
      "2023 Honda Odyssey ",
      70,
      7,
      "Medium",
      "Minivan"
    );
    Car Economy = new Car(
      "Economy",
      "2017 Toyota 86",
      45,
      4,
      "Poor",
      "Coupe"
    );
    Car Intermediate = new Car(
    "Intermediate",
    "2023 Lexus RX",
    50,
    4,
    "Medium",
    "Hybird"
    );
    Car Standard = new Car(
     "Standard",
     "2023 Kia Telluride",
     55,
     5,
    "Good",
     "SUV"
    );

    //create an admin
    Admin adminobject = new Admin(
      Economy,
      Intermediate,
      Standard,
      Van
    );
    Scanner input = new Scanner(System.in);
    HashMap<String, String> logininfo = new HashMap<String, String>();
    //IDandPassword idandPasswords = new IDandPassword();
   
    String Username, Password;
    while (true) {
      //get username and password
      System.out.print("Username: ");
      Username = input.next();
      System.out.print("Password: ");
      Password = input.next();

      //get the stored login info
      logininfo = adminobject.getLoginInfo();

      //check username and password first before getting user inputs
      if (logininfo.containsKey(Username)) {
        if (logininfo.get(Username).equals(Password)) {
          if (Username.equals("Admin")) {
            adminobject.Options();
          } else {
            //get user inputs for days, mileage, and passenger
            int Passenger, Mileage, RentalDays;
            System.out.print("Please enter the number of passengers: ");
            Passenger = input.nextInt();
            
            if (Passenger <= 0) {
              System.out.println("error");
              System.exit(0);
            }
            
            System.out.print("Please enter the number of days of rental: ");
            RentalDays = input.nextInt();
            if (RentalDays <= 0) {
              System.out.println("error");
              System.exit(0);
            }
            
            System.out.print("Enter the approximate mileage for the trip: ");
            Mileage = input.nextInt();
            if (Mileage <= 0) {
              System.out.println("error");
              System.exit(0);
            }

            User userSearch = new User(RentalDays,Passenger, Mileage,Economy,Intermediate, Standard, Van);
            //find suitable cars and print it
            userSearch.findSuitableCars();
          }
        } else {
        	System.out.println("The password you entered is incorrect, please try again");}
      } else {
    	  System.out.println("The username you entered was not found, please try again");}
    }
  }

  public static void main(String[] args) throws Exception {
    login();
  }
}
