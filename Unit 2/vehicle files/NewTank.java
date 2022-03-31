/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: Mar 10 2022
 * Object: Tank
 * Description: creates a tank class
 */

public class NewTank extends Vehicle {
    /*
    Tank Attributes:
    List of Contained Variables
    everything in vehicle class
    weapons :  String
     */

     /* name of the vehicle
    */
    /* the weapons used for the tank
    */
    private String weapons;
}

  /*
    * Constructor - sets up the values
    * to become vegtables
    */
  
    //sets up the default settings of the tank (Unnamed)
	  public Tank() {
      //general info of the tank
      this.name = " ";
		  this.originCountry = " ";
      this.weapons = " ";
      this.maximumFuelCapacity = -1;

      //fuel related statistics for vehicle purposes
      this.fuelLeft = -1;
      this.fuelEfficency = -1;
      this.fuelCapacity = -1;

      //market related statistics 
      this.brand = " ";
      this.price = -1;

      //dimension statistics
      this.length = -1;
      this.width = -1;
      

	}

    //this completely sets up the tank with every single attachment and parts together
	  public Tank(String name, String originCountry, String weapons, double maximumFuelCapacity, double fuelLeft, double fuelEfficency, double fuelCapacity, String brand, double price, double length, double width) throws Exception {

      // this sets all string variables together
		  this.name = name;
      this.originCountry = originCountry;
      this.weapons = weapons;
      this.brand = brand;
      
      //in case of invalid parameters, it will immediately throw an exception
		  if((maximumFuelCapacity <= 0)) {
			    throw new Exception("Parameters Invalid");
        } else if((fuelEfficency <= 0)){
			    throw new Exception("Parameters Invalid");
        }  else if((price <= 0)){
			    throw new Exception("Parameters Invalid");
        } else if((length <= 0)){
			    throw new Exception("Parameters Invalid");
        } else if((width <= 0)){
			    throw new Exception("Parameters Invalid");
	    } else {
			 this.maximumFuelCapacity = maximumFuelCapacity;
        this.fuelLeft = fuelLeft;
        this.fuelEfficency = fuelEfficency;
        this.fuelCapacity = fuelCapacity;
        this.price = price;
        this.length = length; 
        this.width = width;
	  }
    }

  /*
    Methods
    The the parts of the tank that move and does something.
    */

      //refueling the tank (will not work if tank is filled)
      public void refuel(double refuel) throws Exception{
        if (refuel <= 0){
          throw new Exception("Negative refuel");
          } else{
          this.fuelCapacity = refuel + fuelLeft;
        if (fuelCapacity > maximumFuelCapacity){
        System.out.println(name + "'s tank' is already full");
        } else {
          System.out.println(name + " was refueled with " + refuel + "L of gasoline.");
          this.fuelLeft = fuelCapacity;
        }
        }
      }

  //check what weapons are on the tank (doesn't do anything else)
  public void checkWeapons(){
      System.out.println(name + " has " + weapons + ". They look brand new.");
  }

    //driving the tank 
    public void drive(double distance){
      double maximumDistanceAble = fuelLeft * fuelEfficency;
      this.fuelLeft = fuelLeft - (distance / fuelEfficency);
      if ((distance <= 0) || (fuelLeft == 0)){
        System.out.println(name + " did not move.");
      } else if ((distance > maximumDistanceAble)){
        this.fuelLeft = 0;
        System.out.println(name + " attempted to travel for " + distance + "km but only was able to travel for " + maximumDistanceAble + "km before running out of fuel.");
        System.out.println("Remember to refuel before making such trip, lad. - Laur J'Koughk");
      } else {
        System.out.println(name + " travelled for " + distance);
        System.out.println(name + " has " + fuelLeft + "L of fuel left");


        
      }
    }

  //changes the weapons of the Tank
  public void changeWeaponTo(String newWeapons){
    String oldWeapons = weapons;
    this.weapons = newWeapons
      System.out.println(oldWeapons + " was changed for " + weapons);
  }

  //tells price sold for tank
  public void sell(){
  System.out.println(name + "would be sold for $" + price);
  }  

  // Method to print out information details
   public String toString() {
      return super.toString() + "\n Weapons: " + this.weapon;
   }
  }
}
