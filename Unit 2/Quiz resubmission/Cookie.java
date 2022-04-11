/**
* Name: Cyrus Yang
* Teacher: Mr Lee 
* Date: Mar 1 2022 
* Object: Cookie
* Description: creates a cookie class to be cookies
* and more  
*/
public class Cookie {
	
	/**
	 * This Attribute is for the Name of the Cookie
	 */
    private String name;
    
    /**
     * This Attribute is for the Weight of the Cookie
     */
    private double weight;
    
    /**
     * This Attribute is for the Calories of the Cookie
     */
    private int calories;
    
    /**
     * This Attribute check the attribute of the Cookie
     */
    private boolean isPackaged;

    /**
     * This Constructor generates a default setting for the Cookie Class
     */
	 public Cookie() {
		  this.name = " ";
		  this.weight = -1;
		  this.calories = -1;
		  this.isPackaged = false;
	 	}
	 
	 	 /**
		 * This Constructor generates the Cookie Class with
		 * new parameters
		 * @param setName
		 * @param weight
		 * @param calories
		 */
		  public Cookie(String setName, double weight, int calories) {

			  //setting up the variables
			  this.name = setName;
	      
			  if(weight < 0) {
				    this.weight = 0;
		    } else {
				    this.weight = weight;
		    }

	      if(calories < 0) {
				    this.calories = 0;
			  } else {
				  this.calories = calories;
	     }
	    }

	 /**
	 * This Constructor generates the Cookie Class with
	 * new parameters
	 * @param setName
	 * @param weight
	 * @param calories
	 * @param isPackaged
	 */
	  public Cookie(String setName, double weight, int calories, boolean isPackaged) {

		  //setting up the variables
		  this.name = setName;
		  this.isPackaged = isPackaged;
      
		  if(weight < 0) {
			    this.weight = 0;
	    } else {
			    this.weight = weight;
	    }

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
	  * This Method gets the Packaged boolean from the constructor and returns it.
	  * @return
	  */
	  public boolean getIsPackaged() {
		  return isPackaged;
	  }
	  
	  /**
	  * This Method changes wrapper status
	  * @param isPackage
	  * @return 
	  */
	  public void openCookieWrapper() {
		isPackaged = false;
	  }

	  /**
	  * This Method changes the value of the cookie when eating
	  * @param weight
	  * @return
	  */
	  public int eaten(double weight) {
		if(isPackaged == true) {
			return -2;
		} else if (weight > this.weight || this.weight == 0) {
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
  
  

