package HW1;

import java.util.Scanner;

//Grocery list maker
//Cyrus Yang™
//Tuesday, February 9 2022
//Creates a small list of grocery items
public class Yang_Cyrus_GroceryItem {
	@SuppressWarnings({ "unused", "resource" })
	public static void main (String[] args)
	{
		//attempts to run the system smoothly
		try {
			
			//constants used as restrictions used for the inputs
			final double MAXIMUM_PRICE = 99.99;
			final int CHARACTER_COUNT = 20;
			
			//variable names for the variables where the names 
			//of groceries are going into
			String groceryItem1;
			String groceryItem2;
		
			//variables for grocery item prices
			double groceryItem1Price;
			double groceryItem2Price;

			//Scanner created for inputs
			Scanner sc = new Scanner(System.in);
		
			//counter for printing default is 25
			int i = 22;
			int groceryItemCharacterCount1 = 0;
			int groceryItemCharacterCount2 = 0;
			
			//introduction of program (program describer for user)
			System.out.println("Welcome to List Generator");
			System.out.println("Created by Cyrus Yang");
			System.out.println("Definitely not a virus I promise");
			
			System.out.printf("%n%n");
			
			
			//Asks user for name of the first product
			System.out.printf("What is the name of the first item?: %n");
			
			//this code collects the user's response for item name
			//must be a double to include longer decimals
			groceryItem1 = sc.nextLine();
			System.out.println("");
			
			//Asks user the price of said object
			System.out.printf("What is the price of that item?: %n");
				
			//this code collects the user's response for price amount
			//must be a double to include longer decimals
			groceryItem1Price = sc.nextDouble();
			System.out.println("");
			
			sc.nextLine();
			
			//asks user for name of the second product
			System.out.println("What is the name of the second item?:");
			
			//this code collects the user's response for item name
			//must be a double to include longer decimals
			groceryItem2 = sc.nextLine();
			System.out.println("");
			
			//Asks user the price of said object
			System.out.print("What is the price of that item?:");
			System.out.println("");
				
			//this code collects the user's response for price amount
			//must be a double to include longer decimals
			groceryItem2Price = sc.nextDouble();
			System.out.println("");
			

		
			//This is used to determine if the price inputs made by the user is valid
			//if it is not valid, it returns with a pseudo-error simulating an actual error
			if ((groceryItem1Price > MAXIMUM_PRICE) || (groceryItem2Price > MAXIMUM_PRICE)){
				//if the prices are over the maximum price
				System.out.printf("%n%n%n");
				System.out.println("System Fatal Error - Invalid Object Value");
				System.out.println("Program will now terminate");
				System.out.printf("%n");
				System.out.println("ERROR CODE: java.util.InvalidObjectValue");
				}
			else if ((groceryItem1.length() > 20) || (groceryItem2.length() > 20)){
				System.out.printf("%n%n%n");
				System.out.println("System Fatal Error - NAME EXCEEDS MAXIMUM CHARACTERS");
				System.out.println("Program will now terminate");
				System.out.printf("%n");
				System.out.println("ERROR CODE: java.util.MaximumCharacterExceededException");
			}
			else {
				
				//spaces out the content to generate the list without seeing previous code
				//have to remember what the clear screen code was (other codes may have this)
				System.out.printf("%n%n%n%n%n");
				
				//this is used to print the header of the program display of list
				while (i>0) {
				System.out.print("-");
				i--;
				}
				System.out.println("");
				
				//used for space counting
				int spacingAmountForScript = 21 - groceryItem1.length() - 5;
				
				//Grocery 1
				System.out.print(groceryItem1);
				while (spacingAmountForScript > 0) {
				System.out.print(" ");
				spacingAmountForScript --;
				}
				System.out.print("$" + groceryItem1Price);
				
				System.out.println(" ");
				System.out.println(" ");
				
				//ditto as the same
				spacingAmountForScript = 21 - groceryItem2.length() - 5;
				
				//Grocery 2
				System.out.print(groceryItem2);
				while (spacingAmountForScript > 0) {
				System.out.print(" ");
				spacingAmountForScript --;
				}
				System.out.print("$" + groceryItem2Price);
				
				System.out.println("");
				
				//this is used to print the footer of the program display of list
				
				i=22;
				while (i>0) {
				System.out.print("-");
				i--;
				}
			}
			
			
			
		}
		//This is used for contingencies when the user inputs severely invalid digits or 
		catch (Exception e) {
			System.out.printf("%n%n%n");
			System.out.println("System Fatal Error - Invalid Input");
			System.out.println("Program will now terminate");
			System.out.println("");
			System.out.println("ERROR CODE:" + e);
		}
		
	}
}
