package HW1;

import java.util.Scanner;

//Encryption Device
//Cyrus Yang™
//Tuesday, February 9 2022
//Encrypts a phrase using a very primitive encoding
public class Yang_Cyrus_Encryption {
	
	//method used to encrypt the document
	public static String encryptString(String regularString){
		
		
		//used for the moving of the letters and scrambling
		char regularStringFragmented[] = regularString.toCharArray();
		int regularStringSize[] = new int[regularString.length()];
		
		//this is what id does if there is no space in front of the sentence/phrase
		if (regularStringFragmented[0] != ' ') {
		//this is for encrypting the line by swapping the front of letter with the last letter
		  for (int i = 0; i < regularStringFragmented.length; i++) {
			  
	            // k stores index of first character
	            // and i stores index of last character read. 
	            int k = i;
	            while ((i < regularStringFragmented.length) && (regularStringFragmented[i] != ' ')) 
	                i++;
	            // Swapping the last letters of the words inside the phrase
	            char temp = regularStringFragmented[k];
	            regularStringFragmented[k] = regularStringFragmented[i - 1];
	            regularStringFragmented[i - 1] = temp;
	            regularStringSize[k] = k;
	            
	        }
		  
	}
		else {
			// it skips the spacing to prevent out of bounds error
			for (int i = 1; i < regularStringFragmented.length; i++) {
				  
	            // k stores index of first character
	            // and i stores index of last character read. 
	            int k = i;
	            while ((i < regularStringFragmented.length) && (regularStringFragmented[i] != ' ')) 
	                i++;
	            // Swapping the last letters of the words inside the phrase
	            char temp = regularStringFragmented[k];
	            regularStringFragmented[k] = regularStringFragmented[i - 1];
	            regularStringFragmented[i - 1] = temp;
	            regularStringSize[k] = k;
	            
	        }
		}
	
		  //this is for setting up the spacing locations
		  for (int i = 1; i < regularStringFragmented.length - 1; i++) {
			  int k = i;
		   if (regularStringFragmented[k] == ' ') {
           	regularStringSize[k] = 0;
           }
			  i++;
		  }

		  //this is setting up for nonspacing zones
		  for (int i = 1; i < regularStringFragmented.length - 1; i++) {
			  int k = i;
		  if ((regularStringSize[k+1] != 0) || (regularStringSize[k-1] != 0) ||
				   (k != 1)) {
			   regularStringSize[k] = 1;
		   }
		  }

		  //this was to debug the glitch in the second letter
		  if (regularStringFragmented[0] != ' ' || regularStringFragmented[1] != ' ' ) {
		  regularStringFragmented[1] = (char)(regularStringFragmented[1] + 2);
		  }
		  
		  // for first couple of conversions to make it work out by changing the middle characters to match
		  //ascii shift
		  for (int i = 1; i < regularStringFragmented.length - 1; i++) {
			  int k = i;
			  if (regularStringSize[k] == 1 && regularStringFragmented[k] != ' '
					  && regularStringFragmented[k + 1] != ' ' && regularStringFragmented[k - 1] != ' ') {
				  regularStringFragmented[k] = (char)(regularStringFragmented[k] + 2);
			   }  
		  }

		  //debugged another bug 
		  if (regularStringFragmented[1] == '$' ) {
		  regularStringFragmented[1] = ' ';
		  regularStringFragmented[2] = (char) (regularStringFragmented[2] - 2);
		  }
		  
		  
		  // returns the user the value of the string
		  return String.valueOf(regularStringFragmented); 
		  
		
	}
	//this is an eclipse tool to ignore the 
	@SuppressWarnings("resource")
	
	//main driver code
	public static void main (String[] args){
	//Scanner created for inputs
	Scanner sc = new Scanner(System.in);
	
	//this sect requests for a phrase to be encrypted
	System.out.println("Enter a line to be encrypted: ");
	String unencryptedString = sc.nextLine();
	System.out.println("");
	
	//encrypts the string
	System.out.println(encryptString(unencryptedString));
	}
}
