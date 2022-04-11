/**
 * Name: Zain Siddiqui & revised by Cyrus Yang (debugged by Cyrus Yang)
 * Teacher: Mr Lee
 * Date: Mar 1 2022
 * Object: SuperClass
 * Description: Creating a Super class for APC and Tank
 */

// Super class for APC and Tank.
public class Vehicle {

	/**
	 * This Attribute is for the name of the vehicle
	 */
    public String name;
  
	/**
	 * This Attribute is for the origin of the vehicle
	 */
    public String originCountry;

	/**
	 * This Attribute is for the maximum fuel capacity in the fuel tank of the vehicle
	 */
    public double maximumFuelCapacity;

	/**
	 * This Attribute is for the fuel efficiency of the vehicle
	 */
    public double fuelEfficency;

	/**
	* This Attribute is for the fuel left in the fuel tank of the vehicle
	*/
    public double fuelLeft;

	/**
	 * This Attribute is for temporary data of fuel capacity in the fuel tank of the vehicle
	 */
    public double fuelCapacity;

	/**
	 * This Attribute is for the brand of the vehicle
	 */
    public String brand;

	/**
	 * This Attribute is for the price of the vehicle
	 */
    public double price;

	/**
	 * This Attribute is for the dimensional length of the vehicle
	 */
    public double length;

	/**
	 * This Attribute is for the dimensional width of the vehicle
	 */
    public double width;

    /**
     * This Constructor generates a default setting for the NewTank Class
     */
	  public Vehicle() {
      //general info of the vehicle
      this.name = " ";
		this.originCountry = " ";
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

		 /**
		 * This Constructor generates the Vehicle Class with
		 * new parameters and providing subclasses extra information
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
		 */
	    public Vehicle(String name, String originCountry, double maximumFuelCapacity, double fuelLeft, double fuelEfficency, double fuelCapacity, String brand, double price, double length, double width) throws Exception {

	    	// this sets all string variables together
	    	this.name = name;
	    	this.originCountry = originCountry;
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
	  
	  /**
	   * This Method converts the data to a real string
	   * @return
	   */
      public String toString() {
    	  String output = "Name of Vehicle: ";
    	  output = output + name + "\n" ;
    	  output = output + "Brand: "+ brand + "kg\n";
    	  output = output + "Country of Origin: "+ originCountry;
    	  output = output + "Price: "+ price + "kg\n";
    	  output = output + "Dimensions: " + length + "m by" + width + "m\n";
    	  return output = output + "Fuel left: "+ fuelLeft + "/" + maximumFuelCapacity;
      }
}
