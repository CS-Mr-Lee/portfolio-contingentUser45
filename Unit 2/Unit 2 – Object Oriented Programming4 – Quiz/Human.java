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

    /* the name of the object eaten 
    * which is a cookie
    * and cookie
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
        System.out.println("Human has slept for " + hours);
        this.energyLevel = (int) (energyLevel + hours * 0.1);
      }

      //human does a run by designated amount of time given
      public void run(double km){
        System.out.println("Human ran for " + km);
        this.energyLevel = (int) (energyLevel / (
          km * 0.03));
        this.weight = weight - 0.001 * km ;
        }

      public void eat(Vegetable veg, double grams){
        if (grams > weight){
          System.out.println("Human does not have enough " + name + " to eat.");
        } else {
          System.out.println("Human has eaten " + grams + " of " + name);
          this.weight = weight + 0.001 * grams;
          this.energyLevel = energyLevel + (int)(calories * grams * 0.01 * 0.01 / 15);
          }
        }
        

      public void eat(Cookie food, double grams){
        if (grams > weight){
          System.out.println("Human does not have enough " + name + " to eat.");
          } else if (isPackaged = true){
           System.out.println("Human: What is this? I can't eat that!");
          } else {
          System.out.println("Human has eaten " + grams + " of " + name);
          this.weight = weight + 0.001 * grams;
          this.energyLevel = energyLevel + (int)(calories * grams * 0.01 * 0.01 / 15);
        }

        	
    toString();
   }
}
  