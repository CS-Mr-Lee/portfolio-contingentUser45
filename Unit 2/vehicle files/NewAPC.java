/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: Mar 10 2022
 * Object: Tank
 * Description: creates a tank class
 */

public class NewAPC extends Vehicle {
    /*
    Tank Attributes:
    List of Contained Variables
    everything in vehicle class
    weapons :  String
     */

     /* name of the vehicle
    */
    /* the sitrep of the tires
    */
    private String wheelStatus;
}

  /*
    * Constructor - sets up the values
    * to become vegtables
    */
  
    //sets up the default settings of the tank (Unnamed)
	public APC() {
	super();     
	this.wheelStatus = " ";
}

    //this completely sets up the tank with every single attachment and parts together
	  public APC(String name, String originCountry, String wheelStatus, double maximumFuelCapacity, double fuelLeft, double fuelEfficency,
		      double fuelCapacity, String brand, double price, double length, double width) throws Exception {
      super(name, originCountry, maximumFuelCapacity, fuelLeft, fuelEfficency,
       fuelCapacity, brand,  price, length, width);
      // this sets all string variables together
      this.wheelStatus = wheelStatus;
	  }
    }

  /*
    Methods
    The the parts of the tank that move and does something.
    */

      //refueling the apc (will not work if tank is filled)
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

  //check wheelstatus are on the tank (doesn't do anything else)
  public void checkWeapons(){
      System.out.println(name + "'s wheels are" + wheelStatus);
  }

    //driving the apc
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

  //tells price sold for tank
  public void sell(){
  System.out.println(name + "would be sold for $" + price);
  }  

  // Method to print out information details
   public String toString() {
      return super.toString() + "\n Wheel Status: " + this.wheelStatus;
   }
  }
}