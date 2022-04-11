
/** 
* Name: Cyrus Yang
* Teacher: Mr Lee 
* Date: Mar 1 2022 
* Object: Vegetable
* Description: creates a vegetable class
* and more  
*/
public class Vegetable {

	/**
	* This Attribute is for the Name of the Vegetable
	*/
    private String name;

    /**
     * This Attribute is for the Weight of the Vegetable
     */
    private double weight;

    /**
    * This Attribute is for the Calories of the Vegetable
    */
    private int calories;


    /**
     * This Constructor generates a default setting for the Vegetable Class
     */
	  public Vegetable() {
		  this.name = " ";
		  this.weight = -1;
		  this.calories = -1;
	}

	 /**
	  * This Constructor generates the Cookie Class with
	  * new parameters
	  * @param setName
	  * @param weight
	  * @param calories
	  */
	  public Vegetable(String setName, double weight, int calories) {

      // this set into stone objects are immediately set into place with the variables given by the numbers.
		  this.name = setName;

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
  
	  /**
	  * This Method gets the name from the constructor and returns it.
	  * @return
	  */
	  public String getName() {
		  return name;
	  }

	  /**
	  * This Method gets the weight from the constructor and returns it.
	  * @return
	  */
	  public double getWeight() {
		  return weight;
	  }

	  /**
	  * This Method gets the calories from the constructor and returns it.
	  * @return
	  */
	  public int getCalories() {
		  return calories;
	  }

	  /**
	  * This Method changes the value of the cookie when eating
	  * @param weight
	  * @return
	  */
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

	 /**
	 * This Method converts the data to a real string
	 * @return
	 */
      public String toString() {
	     String output = "Name: ";
    output = output + name + "\n" ;
    output = output + "Weight: "+ weight + "kg\n";
    output = output + "Calories: "+ calories + "%\n";
	    return output;
	}
}
  
  

