package HW1;

import java.util.Scanner;
import java.lang.Math;

//Triangle Solver
//Cyrus Yang™
//Tuesday, February 9 2022
//Runs a method that returns the smallest angle in a triangle 
//in degrees given two sides and an angle.

@SuppressWarnings({ "unused", "resource" })

public class Yang_Cyrus_SASTriangleSolver {
	
	//method used for finding the smallest angle with the assigned numbers
	public static void findSmallestAngle(double userSide1, double userSide2,
			double userAngle){
		
		//this is to make sure when It breaks it doesn't return without a visual reasoning
		try {
			
			//variables being assigned for calculation
			double angle1 = userAngle;
			double angle2 = Math.asin((userSide2 / (userSide1 / Math.sin(userAngle))));
			double angle3 = Math.PI - angle1 - angle2;
			
			//this is used to prevent invalid arguments which the first angle exceeds pi (which is not a triangle)
			 if (angle3 > 0) {
				 
				 //this entire chain finds the smallest angle in the triangle
				 //it uses a moderately sized if-else block to find the correct answer
				 if ((angle1 > angle2) && (angle2 > angle3))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle3) + (char)(248)); 
			        }
			        else if ((angle2 > angle3) && (angle3 > angle2))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle2) + (char)(248)); 
			        }
			        else if ((angle2 > angle3) && (angle3 > angle1))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        } 
			        else if ((angle3 > angle2) && (angle2 > angle1))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        }
			        else if ((angle2 > angle1) && (angle1 > angle3))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle3) + (char)(248)); 
			        }
			        else if ((angle1 > angle3) && (angle3 > angle2))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle2) + (char)(248)); 
			        }
			        else if ((angle1 > angle2) && (angle2 == angle3))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle3) + (char)(248)); 
			        }
			        else if ((angle2 > angle3) && (angle3 == angle2))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle2) + (char)(248)); 
			        }
			        else if ((angle2 > angle3) && (angle3 == angle1))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        }
			        else if ((angle3 > angle2) && (angle2 == angle1))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        }
			        else if ((angle2 > angle1) && (angle1 == angle3))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle3) + (char)(248)); 
			        }
			        else if ((angle1 > angle3) && (angle3 == angle2))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle2) + (char)(248)); 
			        }
				 
			        else if ((angle1 == angle2) && (angle2 > angle3))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle3) + (char)(248)); 
			        }
			        else if ((angle2 == angle3) && (angle3 > angle2))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle2) + (char)(248)); 
			        }
			        else if ((angle2 == angle3) && (angle3 > angle1))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        } 
			        else if ((angle3 == angle2) && (angle2 > angle1))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        }
			        else if ((angle2 == angle1) && (angle1 > angle3))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle3) + (char)(248)); 
			        }
			        else if ((angle1 == angle3) && (angle3 > angle2))
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle2) + (char)(248)); 
			        }
			        else
			        {
			        	//this is used to find the smallest angle
			        	System.out.println("Smallest angle is: " + java.lang.Math.toDegrees(angle1) + (char)(248)); 
			        }
				 
			 }
			 else {
				System.out.printf("%n%n%n");
				System.out.println("System Fatal Error - Invalid Input");
				System.out.println("Program will now terminate");
				System.out.println("");
				System.out.println("ERROR CODE: Java.Math.AngleOutOfBounds");
			 }
			
		}
		catch (Exception e) {
			System.out.printf("%n%n%n");
			System.out.println("System Fatal Error - Invalid Input");
			System.out.println("Program will now terminate");
			System.out.println("");
			System.out.println("ERROR CODE:" + e);
		}
		
	}
	public static void main (String[] args){
		
		//variable sides for input
		double side1;
		double side2;
		double inputtedAngle;

		//Scanner created for inputs
		Scanner sc = new Scanner(System.in);
		
		try {
		
		//this sect requests for the value for a side
		System.out.println("Please type in a value for a side:");
		side1 = sc.nextDouble();
		System.out.println("");
		
		//this sect requests for the value for another side
		System.out.println("Good!, now please type in a value for another side:");
		side2 = sc.nextDouble();
		System.out.println("");
		
		//this sect requests for the value for a side
		System.out.println("Good!, now please type in a value for an angle (in radians only please) :");
		inputtedAngle = sc.nextDouble();
		System.out.println("");
		
		//runs the method to give you a response
		findSmallestAngle(side1, side2 , inputtedAngle);
		
		}
	
		catch (Exception e) {
			System.out.printf("%n%n%n");
			System.out.println("System Fatal Error - Invalid Input");
			System.out.println("Program will now terminate");
			System.out.println("");
			System.out.println("ERROR CODE:" + e);
		}
		
	}
		
}
