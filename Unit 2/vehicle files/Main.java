/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: Mar 10 2022
 * Object: Driver Class
 * Description: drives the whole thing
 */

class Main {
  public static void main(String[] args) {
    
@SuppressWarnings("unused")
   

public class Yang_Cyrus_OOQuiz1 {

	public static void main(String[] args) {
		
		//Scanner created for inputs
		Scanner sc = new Scanner(System.in);

    //Asks user for type of the vehicle
		System.out.printf("What is kind of the vehicle is it? (must be tank or apc) %n");
		
		//this code collects the user's response for type
		String type = sc.nextLine();
		System.out.println("");
    
    if (type.contains("ank")){

      //Asks user for name of the vehicle
		System.out.printf("What is the name of the vehicle: %n");
		
		//this code collects the user's response for tank name
		String name = sc.nextLine();
		System.out.println("");

    //Asks user for origin of vehicle
		System.out.printf("What is the country that made this: %n");
		
		//this code collects the user's response for origin
		String originCountry = sc.nextLine();
		System.out.println("");
      
    //Asks user for the weight of the vehicle
		System.out.printf("What is the weight of the vehicle?: %n");
		
		//this code collects the user's response for weight
		//must be a double to include longer decimals
		double maximumFuelCapacity = sc.nextDouble();
		System.out.println("");

    //Asks user for the maximum fuel
		System.out.printf("What is the maximum fuel capacity of the vehicle?: %n");
		
		//this code collects the user's response for maximum fuel capacity
		//must be a double to include longer decimals
		double maximumFuelCapacity = sc.nextDouble();
		System.out.println("");

    //Asks user for the current fuel count
		System.out.printf("What is the current fuel count in the fuel tank?: %n");
		
		//this code collects the user's response for fuel
		//must be a double to include longer decimals
		double fuelLeft = sc.nextDouble();
		System.out.println("");

    //Asks user for the fuel efficency
		System.out.printf("What is the fuel efficency of vehicle (km/l): %n");
		
		//this code collects the user's response for fuel
		//must be a double to include longer decimals
		double fuelEfficency = sc.nextDouble();
		System.out.println("");  

    //Asks user for the price of vehicle
		System.out.printf("What is the price of the vehicle?: %n");
		
		//this code collects the user's response for price
		//must be a double to include longer decimals
		double price = sc.nextDouble();
		System.out.println("");

    //Asks user for the length of vehicle
		System.out.printf("What is the length of the vehicle?: %n");
		
		//this code collects the user's response for price
		//must be a double to include longer decimals
		double length = sc.nextDouble();
		System.out.println("");

    //Asks user for the width of vehicle
		System.out.printf("What is the width of the vehicle?: %n");
		
		//this code collects the user's response for price
		//must be a double to include longer decimals
		double width = sc.nextDouble();
		System.out.println("");

      
		Tank tank = Tank(name, originCountry, weapons, maximumFuelCapacity, fuelLeft, fuelEfficency, fuelCapacity, brand, price, length, width);
      
      } else if (type.contains("apc") || type.contains("APC") || type.contains("rmored") || type.contains("ersonel")) {

    //Asks user for name of the vehicle
		System.out.printf("What is the name of the vehicle: %n");
		
		//this code collects the user's response for tank name
		String name = sc.nextLine();
		System.out.println("");

    //Asks user for origin of vehicle
		System.out.printf("What is the country that made this: %n");
		
		//this code collects the user's response for origin
		String originCountry = sc.nextLine();
		System.out.println("");
      
		//Asks user for the weight of the vehicle
		System.out.printf("What is the weight of the vehicle?: %n");
		
		//this code collects the user's response for weight
		//must be a double to include longer decimals
		double maximumFuelCapacity = sc.nextDouble();
		System.out.println("");

    //Asks user for the maximum fuel
		System.out.printf("What is the maximum fuel capacity of the vehicle?: %n");
		
		//this code collects the user's response for maximum fuel capacity
		//must be a double to include longer decimals
		double maximumFuelCapacity = sc.nextDouble();
		System.out.println("");

    //Asks user for the current fuel count
		System.out.printf("What is the current fuel count in the fuel tank?: %n");
		
		//this code collects the user's response for fuel
		//must be a double to include longer decimals
		double fuelLeft = sc.nextDouble();
		System.out.println("");

    //Asks user for the fuel efficency
		System.out.printf("What is the fuel efficency of vehicle (km/l): %n");
		
		//this code collects the user's response for fuel
		//must be a double to include longer decimals
		double fuelEfficency = sc.nextDouble();
		System.out.println("");  

    //Asks user for the price of vehicle
		System.out.printf("What is the price of the vehicle?: %n");
		
		//this code collects the user's response for price
		//must be a double to include longer decimals
		double price = sc.nextDouble();
		System.out.println("");

    //Asks user for the length of vehicle
		System.out.printf("What is the length of the vehicle?: %n");
		
		//this code collects the user's response for price
		//must be a double to include longer decimals
		double length = sc.nextDouble();
		System.out.println("");

    //Asks user for the width of vehicle
		System.out.printf("What is the width of the vehicle?: %n");
		
		//this code collects the user's response for price
		//must be a double to include longer decimals
		double width = sc.nextDouble();
		System.out.println("");

     APC(String brand, String originCountry, String wheelStatus, String name)

    } else {
    System.out.printf("Invalid Type");
    }
	}

}
