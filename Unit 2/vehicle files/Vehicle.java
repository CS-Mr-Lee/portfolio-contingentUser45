/**
 * Name: Zain Siddiqui & revised by Cyrus Yang
 * Teacher: Mr Lee
 * Date: Mar 1 2022
 * Object: SuperClass
 * Description: Creating a Super class for Apc and Tank

 */

// Super class for APC and Tank.
public class Vehicle {
    /*
    Vehicle Attributes:
    List of Contained Variables
    originCountry : String
    fuelEfficency : double
    brand : String
    fuelLeft : double
    price : double
    length: double
    width : double
    weapons :  String
    fuelCapacity: double
     */

     /* name of the vehicle
    */
    private String name;
  
    /* original country of maunfacture
    */
    private String originCountry;

    /* the fuel capacity of the vehicle
    */
    private double maximumFuelCapacity;

    /* the fuel efficency used to calculate how much fuel
    */
    private double fuelEfficency;

    /* the fuel remaining inside of the fuel tank of the vehicle
    */
    private double fuelLeft;

    /* the fuel capacity of the vehicle
    */
    private double fuelCapacity;

    /* the brand of the vehicle
    */
    private String brand;

    /* the price of the vehicle
    */
    private double price;

    /* the length of the vehicle
    */
    private double length;

    /* the length of the vehicle
    */
    private double width;

  /*
    * Constructor - sets up the values
    * to become vegtables
    */
  
    //sets up the default settings of the tank (Unnamed)
	  public Vehicle() {
      //general info of the tank
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

    //this completely sets up the tank with every single attachment and parts together
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
		// Method to print out information details
      public String toString() {
    String output = "Name of Vehicle: ";
    output = output + name + "\n" ;
    output = output + "Brand: "+ brand + "kg\n";
    output = output + "Country of Origin: "+ originCountry + "kg\n";
    output = output + "Price: "+ price + "kg\n";
    output = output + "Dimensions: " + length + "m by" + width + "m\n";
    output = output + "Fuel left: "+ fuelLeft + "/" + maximumFuelCapacity + "%\n";
  }
}
