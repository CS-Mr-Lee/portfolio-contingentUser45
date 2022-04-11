/**
 * Name: Cyrus Yang (debugged by Cyrus Yang)
 * Teacher: Mr Lee
 * Date: Mar 10 2022
 * Object: Tank
 * Description: creates a tank class
 */

public class NewTank extends Vehicle {

	/**
	 * This Attribute is for the weapon on the tank
	 */
    private String weapons;

    /**
     * This Constructor generates a default setting for the NewTank Class
     */
	public NewTank() {
	super();     
	this.weapons = " ";
	}

	 /**
	 * This Constructor generates the NewTank Class with
	 * new parameters and borrowing from the superclass to generate
	 * @param name
	 * @param originCountry 
	 * @param maximumFuelCapacity
	 * @param fuelLeft
	 * @param fuelEfficency
	 * @param fuelCapacity
	 * @param brand
	 * @param price
	 * @param length
	 * @param width
	 * @param weapons
	 */
	  public NewTank(String name, String originCountry, String weapons, double maximumFuelCapacity, double fuelLeft, double fuelEfficency,
		      double fuelCapacity, String brand, double price, double length, double width) throws Exception {
      super(name, originCountry, maximumFuelCapacity, fuelLeft, fuelEfficency,
       fuelCapacity, brand,  price, length, width);
      // this sets all string variables together
      this.weapons = weapons;
    }

	  /**
	  * This Method refuels the vehicle and prevents the user from causing negative fueling
	  * @param refuel
	  */
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

      /**
 	  * This Method checks the weapons on the tank (a pointless feature)
 	  */
      public void checkWeapons(){
    	  System.out.println(name + " has " + weapons + ". They look brand new.");
      }

      /**
  	  * This Method drives the tank, moving the tank
  	  * @param distance
  	  */
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

      /**
 	  * This Method changes weapons to a different weapon
 	  * @param newWeapons
 	  */
    	public void changeWeaponTo(String newWeapons){
    		String oldWeapons = weapons;
    		this.weapons = newWeapons;
    		System.out.println(oldWeapons + " was changed for " + weapons);
    	}	
  
    	/**
    	* This Method tells the user the value of the tank
    	*/
    	public void sell(){
    		System.out.println(name + "would be sold for $" + price);
    	}	  

  	  	/**
  	  	 * This Method converts the data to a real string
  	  	 * @return
  	  	 */
    	public String toString() {
    		return super.toString() + "\nWeapons: " + this.weapons + "\n";
    	}
}
