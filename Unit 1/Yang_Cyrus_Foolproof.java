package HW1;

import java.io.*;
import java.util.*;

//Supposedly Foolproof Program
//Cyrus Yang™
//Tuesday, February 9 2022
// Short: Bugs you to give it details until you tell it to stop
// Long: Repeatedly asks for the numerator and divisor. 
//For each set of data, the program prints out the result (quotient),
//or an informative error message if there is a problem (division by zero or poor input data). 
//The program continues looping, even if there is a problem. 
// Will exit the loop when data entered for the numerator start with characters “q” or “Q”. 
public class Yang_Cyrus_Foolproof {
	public static void main(String[] args) {
		   
		   //runs the method for foolproof program
		   FoolproofProgram();
		   
	   }
	   
	   public static void FoolproofProgram(){
			//Scanner created for inputs
			@SuppressWarnings("resource") //eclipse related junk
			Scanner sc = new Scanner(System.in);
		
		//loop value for foolproof program
		@SuppressWarnings("unused") //eclipse related junk
		boolean loop = true;
		
		//loops forever
		while (loop = true) {
		//this part is in case someone decides to input unparseble values
		  try {
			  //gets numerator from user input
		   System.out.print("Enter the numerator: ");
			String numerator = sc.nextLine();
			
			   
			//used for if person wants to quit the program
			if ((numerator.contains("q") || numerator.contains("Q")) 
					&& ((numerator.charAt(0) == 'q') || (numerator.charAt(0) == 'Q'))){	
				break;
			}
			else
			{
				//used for parsing numerator to something useful
				double numeratorDouble = Double.parseDouble(numerator);
				
				  //gets denominator from user input
				System.out.print("Enter the denominator: ");
				String denominator = sc.nextLine();
				
				//used for parsing denominator to something useful
				double denominatorDouble = Double.parseDouble(denominator);
				
				//this is for if 0 is denominator
				if (denominatorDouble == 0) {
					System.out.println("You can't divide " + numerator + " by 0");
				}
				else {
					//prints results
					System.out.println( numerator + " / " + denominator + " is "
				+ numeratorDouble/denominatorDouble);
				}
			}
			
		  }
		catch (Exception e) {
			System.out.println("You entered bad data.\r\n" + 
					"Please try again.");
		}
			//spaces things out
		   System.out.println();
			//spaces things out
		   System.out.println();
		}
	   }
}
