 @SuppressWarnings("unused")
   
/** * Name: Cyrus Yang
* Teacher: Mr Lee 
* Date: Mar 1 2022 
* Object: Cookie
* Description: creates a cookie class to be cookies
* and more  
*/
public class Vegetable {
     /*
    Vegetable Attributes:
    Contains 
    name
    weight of object
    calorie contains
     */

    /* the name of the vegetable
    */
    private String name;

    /* the weight of the vegetable
    */
    private double weight;

    /*
    the calories in the vegetable
    */
    private int calories;


    /*
    * Constructor - sets up the values
    * to become vegtables
    */
  
    //sets up the default settings of the vegetable (Unnamed)
	  public Vegetable() {
		  this.name = " ";
		  this.weight = -1;
		  this.calories = -1;
	}

    //sets up vegetables (Remember, boolean must be included just for simplicity)
	  public Vegetable(String setName, double weight, int calories) {

      // this set into stone objects are immediately set into place with the variables given by the numbers.
		  this.name = setName;
      this.isPackaged = isPackaged;

      //in case of underweight objects it sets it to 0 to prevent issues
		  if(weight < 0) {
			    this.weight = 0;
	    } else {
			    this.weight = weight;
	  }

      //  same thing as above but in calories
      if(calories < 0) {
			    this.calories = 0;
		  } else {
			  this.calories = calories;
     }
    }
  
    /*
    * Methods
    * These methods are used for cookie repairs and modifications
    */

    //gets name of cookies
	  public String getName() {
		  return name;
	  }

    //gets the weight of the cookies
	  public double getWeight() {
		  return weight;
	  }

    //gets the calories of the object
	  public int getCalories() {
		  return calories;
	  }

    //used to open the bag to set cookie is unpackaged
    public void openCookieWrapper() {
		isPackaged = false;
	  }

    //used determine what exactly has been eaten and how much of it has been eaten
    public int eaten(double weight) {
    // checks for weight is possible, if not, return error code -1
		if (weight > this.weight || this.weight == 0) {
			return -1;
		} else{
			double removedAmountPercentage = (weight / this.weight);
			double caloriesEaten = this.calories * removedAmountPercentage;
			this.calories = (int) (this.calories - caloriesEaten);
			this.weight = this.weight - weight;
			return calories;
		  }
    }
    //this is to return values for string variables:

      public String toString() {
	     String output = "Name: ";
    output = output + name + "\n" ;
    output = output + "Weight: "+ weight + "kg\n";
    output = output + "Calories: "+ calories + "%\n";
	    return output;
	}
}
  
  

