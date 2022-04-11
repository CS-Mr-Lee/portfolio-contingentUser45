/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: Mar 1 2022
 * Object: Human
 * Description: create a human class 3 attributes
 * and more 
 */
public class Human {

	/**
	* This Attribute is for the Name of the Human
	*/
    private String name;

    /**
    * This Attribute is for the Weight of the Human
    */
    private double weight;

    /**
    * This Attribute is for the Energy level of the Human
    */
    private int energyLevel;
  

    /**
     * This Constructor generates a default setting for the Human Class
     */
    public Human() {
      this.name = " ";
      this.weight = -1;
      this.energyLevel = -1;
    }

	 /**
	 * This Constructor generates the Human Class with
	 * new parameters
	 * @param objectNameEaten
	 * @param weight
	 * @param energylevel
	 */
    public Human(String objectNameEaten, double weight,int energyLevel) {
      this.name = objectNameEaten;
      this.weight = weight;
      this.energyLevel = energyLevel;
    }
    
	  /**
	  * This Method alters the human's energy level via "sleeping"
	  * "sleeping" regenerates energy by each hour, 0.1 energy points are added
	  * @param hours
	  */
      public void sleep(int hours){
        System.out.println(name + " has slept for " + hours);
        this.energyLevel = (int) (energyLevel + hours * 0.1);
      }

	  /**
	  * This Method alters the human's energy level and weight via "running"
	  * "running" reducing energy levels and weight
	  * @param km
	  */
      public void run(double km){
        System.out.println(name + " ran for " + km);
        this.energyLevel = (int) (energyLevel / (
          km * 0.03));
        this.weight = weight - 0.001 * km ;
        }

	  /**
	  * This Method alters the human's energy levels and weight by eating
	  * This specific eat method is for cookies
	  * @param veg
	  * @param grams
	  */
      public void eat(Vegetable veg, double grams){
         int calories = veg.eaten(grams);
         double gramsEaten = grams;
         String vegName = veg.getName();

          if (calories == -1) {
          System.out.println(name + " does not have enough " + vegName + " to eat.");
          } else {
          System.out.println(name + " has eaten " + gramsEaten + " of " + vegName);
          this.weight = weight + 0.001 * gramsEaten;
          this.energyLevel = energyLevel + (int)(calories * gramsEaten * 0.01 * 0.01 / 15);
          }
 		}

	  /**
	  * This Method alters the human's energy levels and weight by eating
	  * This specific eat method is for cookies
	  * @param food
	  * @param grams
	  */
      public void eat(Cookie food, double grams){
        int calories = food.eaten(grams);
        double gramsEaten = grams;
        String foodName = food.getName();
        
        if (calories == -2){
          System.out.println(name + " cannot eat " + foodName + ", it is in a package");
          } else if (calories == -1) {
          System.out.println(name + " does not have enough " + foodName + " to eat.");
          } else {
          System.out.println(name + " has eaten " + gramsEaten + " of " + foodName);
          this.weight = weight + 0.001 * gramsEaten;
          this.energyLevel = energyLevel + (int)(calories * gramsEaten * 0.01 * 0.01 / 15);
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
	  * This Method gets the energy level from the constructor and returns it.
	  * @return
	  */
      public int getEnergyLevel() {
      return energyLevel;
      }

	  /**
	  * This Method converts the data to a real string
	  * @return
	  */
      public String toString() {
    String output = "Name: ";
    output = output + name + "\n" ;
    output = output + "Weight: "+ weight + "kg\n";
    output = output + "Energy: "+ energyLevel + "%\n";

    // extra lines for extra information on sitrep of human energy levels
    if (energyLevel < 25) {
      output = output + name + " is exausted\n";
    } else if (energyLevel > 25 && energyLevel < 50) {
      output = output + name + " is tired\n";
    } else if(energyLevel > 50 && energyLevel < 75) {
      output = output + name + " is Ok\n";
    } else if (energyLevel > 75 && energyLevel < 100) {
      output = output + name + " is energized\n";
    } else {
      output = output + name + " has reached beyond peak human capacity energy\n";
    } 

    // extra lines for extra information on sitrep of human weight
    if (weight < 25) {
      output = output + name + " is malnorished. FEED NOW!\n";
    } else if (weight > 25 && weight < 50) {
      output = output + name + " is underweight, you should eat\n";
    } else if(weight > 50 && weight < 75) {
      output = output + name + " is at normal weight\n";
    } else if (weight > 75 && weight < 100) {
      output = output + name + " is overweight\n";
    } else {
      output = output + name + " has reached Nikocado level fat\n";
    } 
        
    return output;
  }
}
  
