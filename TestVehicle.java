/**
Name: Zain Siddiqui
Date: Apr 1
Description: Testing the vehicles
*/

public class TestVehicle {
   public static void main (String [] args) {
   
       Tank myTank = new Tank("T-54", "Russia", "DShK" , 200000, 20000, 23,
		      20000, "Random Russian Military Manufacturing", 200000, 9.00,3.37);
      
      APC myAPC = new APC("BTR-80", "Russia", "busted" , 200000, 10000, 23,
		      10000, "Random Russian Military Manufacturing", 200000, 9.00,3.37);
      
      //Testing Tank
      
      System.out.println(myTank);
      
      System.out.println("name");
      myTank.addname();
      System.out.println(myTank);
      
      System.out.println("maximumFuelCapacity");
      myTank.addmaximumFuelCapacity();
      System.out.println(myTank);
      
      System.out.println("maximumFuelCapacity");
      myTank.addmaximumFuelCapacity();
      System.out.println(myTank);
      
      System.out.println("fuelLeft");
      myTank.addfuelLeft();
      System.out.println(myTank);
      
      System.out.println("fuelEfficency");
      myTank.addfuelEfficency();
      System.out.println(myTank);
      
      System.out.println("fuelCapacity");
      myTank.addfuelCapacity();
      System.out.println(myTank);
      
      System.out.println("brand");
      myAPC.addbrand();
      System.out.println(myTank);
      
      System.out.println("Price");
      myAPC.addPrice();
      System.out.println(myTank);
      
      System.out.println("length");
      myAPC.addlength();
      System.out.println(myTank);
      
      
      
      
      //Testing APC
      System.out.println(myAPC);
      
      System.out.println("maximumDistanceAble");
      myPlane.maximumDistanceAble;
      System.out.println(myAPC);
      
      System.out.println("name");
      myAPC.addname();
      System.out.println(myAPC);
      
      System.out.println("originCountry");
      myAPC.addoriginCountry();
      System.out.println(myAPC);
      
      System.out.println("WheelStatus");
      myAPC.addWheelStatus();
      System.out.println(myAPC);
      
      System.out.println("maximumFuelCapacity");
      myAPC.addmaximumFuelCapacity();
      System.out.println(myAPC);
      
      System.out.println("fuelLeft");
      myAPC.addfuelLeft();
      System.out.println(myAPC);
            
      System.out.println("fuelEffiecincy");
      myAPC.addmaximumfuelEffiecincy();
      System.out.println(myAPC);
      
      System.out.println("fuelCapacity");
      myAPC.addmaximumfuelCapacity();
      System.out.println(myAPC);
      
      System.out.println("brand");
      myAPC.addbrand();
      System.out.println(myAPC);
      
      System.out.println("Price");
      myAPC.addPrice();
      System.out.println(myAPC);
      
      System.out.println("length");
      myAPC.addlength();
      System.out.println(myAPC);
      
      
      
      
     }
}