package HW1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//League Of Legends Primitive Filter
//Cyrus Yang™
//Tuesday, February 9 2022
//Reads a .json file of champions and returns with the best
//health point champion and the worst armor champion
public class Yang_Cyrus_ChampionFilter {

// method used for the running of the hp checker
	@SuppressWarnings({ "unused" }) // eclipse junk again
	public static void healthPointsAndArmorPointsComparer(){
		
		//since file reader is unpredictable, it is simple to just make a try catch
		try {
		FileReader inputfile = new FileReader("champions.json");
		BufferedReader fileReader = new BufferedReader(inputfile);
		FileWriter outputFile = new FileWriter(new File("MaxChampStats.txt"));
		
		//This is all the strings for name and icon URL.
		String highestHitPointChampion = null;
		String lowestArmorChampion = null;
		String lowestArmorChampionIcon = null;
		String highestHitPointChampionIcon = null;
		
		//max hit point value is default value of 0 due to 0 
		//being the lowest value of health possible
		double highestHitPoints = 0;
		
		//minimum armor value is default value of maximum due to 
		//maximum value being maximum value to prevent misreading
		double lowestArmor = (double) (Integer.MAX_VALUE);
		
		//temporary variables for line read and name of the champion along with image link
		//cause I'm bored
		String currentChampionName = null;
		String currentChampionIcon = null;
		String currentLineRead;
		
		//temporary variables for numerical values of armor and hit points
		double currentArmorRead = (double) (Integer.MAX_VALUE);
		double currentHitPointsRead = 0;
		
		//looper code
		boolean loop = true;

		//loop through every line of the .json file until there is nothing to read
		while(loop = true) {
			
			//read a line of the file
			currentLineRead = fileReader.readLine();
			
			//if there is nothing to read it breaks
			if(currentLineRead == null) {
				inputfile.close();
				fileReader.close();
				break;
			}
			//when the read line contains "name" it reads it and stores the value 
			else if(currentLineRead.contains("\"name\":")) {
				currentChampionName = currentLineRead.substring(13, currentLineRead.length() - 2);
			}
			//if it does not detect "name", it moves on to check if it has "armor"
			else if(currentLineRead.contains("\"armor\":")) {
				currentArmorRead = Double.valueOf(currentLineRead.substring(15, currentLineRead.length() - 1));
			}
			//if it does not detect "name", it moves on to check if it has "armor" and if that doesn't exist, it moves
			//to find "hp"
			else if(currentLineRead.contains("\"hp\":")) {
				currentHitPointsRead = Double.valueOf(currentLineRead.substring(12, currentLineRead.length() - 1));
			}
			//if neither exists
			else if(currentLineRead.contains("\"icon\":")) {
				currentChampionIcon = currentLineRead.substring(13, currentLineRead.length() - 2);
			}
			
			//updates the lowest armor level per new read if found
			if(currentArmorRead < lowestArmor) {
				lowestArmor = currentArmorRead;
				lowestArmorChampion = currentChampionName;
				lowestArmorChampionIcon = currentChampionIcon;
			}

			//updates the highest hit point level per new read
			if(currentHitPointsRead > highestHitPoints) {
				highestHitPoints = currentHitPointsRead;
				highestHitPointChampionIcon = currentChampionIcon;
			}
		}
		
		//once loop has exited, the program writes the answers to MaxChampStats.txt with a bit of a commentary
		
		//Commenting the highest hit point character with image link
		outputFile.write(highestHitPointChampion + " is the most tanky champion at " + highestHitPoints 
				+ " Hitpoints, a total hunk and gigachad. \n");
		outputFile.write("Image link to a image of gigachampion is " + highestHitPointChampionIcon + ", "
				+ "very nice isn't it. \n");
		
		//Commenting the lowest armor character with image link and a diss
		outputFile.write(lowestArmorChampion + " is the least armored at " + lowestArmor
				+ " Armor Points, what a wimp. \n");
		outputFile.write("Image link to a image of wimp champion is " + highestHitPointChampionIcon + ","
				+ ", makes sense after you see it for yourself. \n");
		
		//close fileWriter to prevent the error of open file writer
		outputFile.close();
		
		//tells user that the program works
   		System.out.println("Program Executed Successfully");
		}
		//this catches any errors and asks you to contact the author for assistance
		catch (Exception e) {
			System.out.println("Error: Oh No - My computur has died");
			System.out.println("Please Contact the Author about this issue: " + e);
		}

	}

	//main driver code
   	public static void main(String[] args){
   		System.out.println("This Program will show you which league of legends characters"
   				+ " has highest hit points and which has lowest armor:");
   		System.out.printf(".%n. %n. %n. %n");
   		healthPointsAndArmorPointsComparer();
	}
}
