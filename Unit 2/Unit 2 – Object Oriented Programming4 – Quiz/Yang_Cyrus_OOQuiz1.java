import java.util.Scanner;

@SuppressWarnings("unused")
   
/** * Name: Cyrus Yang
* Teacher: Mr Lee 
* Date: Mar 1 2022 
* Object: Main Driver Code
* Description: Is the main driver for vegetable,
* human and cookie classes
*/

public class Yang_Cyrus_OOQuiz1 {

	public static void main(String[] args) {
		
		//Scanner created for inputs
		Scanner sc = new Scanner(System.in);
		
		//Asks user for name of the human
		System.out.printf("What is the name of the human: %n");
		
		//this code collects the user's response for human name
		String name = sc.nextLine();
		System.out.println("");
		
		//Asks user for the weight of the human
		System.out.printf("What is the weight of the human?: %n");
		
		//this code collects the user's response for price amount
		//must be a double to include longer decimals
		int weight = sc.nextInt();
		System.out.println("");
		
		Human person1 = new Human(name, weight, 100);
		
		Vegetable vegetable1 = new Vegetable("Mysterious Veggie", 690, 120);
		
		Cookie cookie = new Cookie();
		Cookie cookie1 = new Cookie("Garglamav Brownie", 100, 300, true);
		Cookie cookie2 = new Cookie("Kit Fisto Cookies", 200, 500, false);

		person1.eat(cookie1, 150);
		person1.eat(vegetable1, 500);
		person1.eat(cookie2, 100);


	}

}