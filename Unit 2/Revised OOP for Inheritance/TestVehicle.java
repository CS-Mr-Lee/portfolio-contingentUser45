/**
Name: Zain Siddiqui (debugged by Cyrus Yang)
Date: Apr 1
Description: Testing the vehicles
*/

public class TestVehicle {
   public static void main (String [] args) throws Exception {
   
       NewTank myTank = new NewTank("T-90", "Russia", "DShK" , 200000, 20000, 23,
		      20000, "Random Russian Military Manufacturing", 200000, 9.00,3.37);
      
      NewAPC myAPC = new NewAPC("BTR-80", "Russia", "busted" , 200000, 10000, 23,
		      10000, "Random Russian Military Manufacturing", 200000, 9.00,3.37);
      
      //Testing Tank
      System.out.println(myTank);
      myTank.drive(121);
      System.out.println(myTank);
      
      //Testing APC
      System.out.println(myAPC);
      myAPC.checkWheels();
      
     }
}