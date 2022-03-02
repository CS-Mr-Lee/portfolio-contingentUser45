/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: Mar 1 2022
 * Object: Human
 * Description: create a human class 3 attributes
 * and more 
 */
 @SuppressWarnings("unused")
   
// class for a Human object
public class Human {
     /*
    Human Attributes:
    Contains 
    object eaten
    weight
    energy levels
     */

    /* the name of person
    */
    private String name;

    /* the weight of the human 
    * Changes by amount of cookies eaten
    * and can lead to results
    */
    private double weight;

    /* the energy level of the human
    * changes by amount of cookies eaten
    * and changes by exercise
    */
    private int energyLevel;
  
    /*
    * Constructor - for human detailing and set up 
    * to become 
    */

    //initializes the human setup before everything
    public Human() {
      this.name = " ";
      this.weight = -1;
      this.energyLevel = -1;
    }

    //main part of the human movement, sets up how the human eats and runs
    public Human(String objectNameEaten, double weight,int energyLevel) {
      this.name = objectNameEaten;
      this.weight = weight;
      this.energyLevel = energyLevel;
    }

    /*
    Methods
    The driving side of human running
    */

      //the human sleeps and regenerates energy (must be higher than 10 hours for him to regenerate)
      public void sleep(int hours){
        System.out.println(name + " has slept for " + hours);
        this.energyLevel = (int) (energyLevel + hours * 0.1);
      }

      //human does a run by designated amount of time given
      public void run(double km){
        System.out.println(name + " ran for " + km);
        this.energyLevel = (int) (energyLevel / (
          km * 0.03));
        this.weight = weight - 0.001 * km ;
        }

      //eats vegtables
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

      //eats cookies
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

      //String to make human name visible
      public String getName() {
      return name;
      }

      //Double for weight of person
      public double getWeight() {
      return weight;
      }

      //enegy level
      public int getEnergyLevel() {
      return energyLevel;
      }

   // Method to print out human details
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
  
