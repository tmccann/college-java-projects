package diceGamePackage;

import java.util.Scanner;

public class GameController {
	
	//class wide variables
	private int DICE_NUM_SIDES = 6;
	private int NUM_ROLLS = 2;
	private Dice[] rollsArray;
	
	public GameController() {
		
		
		//create input object
		Scanner myObj = new Scanner(System.in);
		
		//Welcome message 
		System.out.println("********DICE GAME WELCOMES YOU TO PLAY**********");
		
		//print 3 lines for spacing 
		System.out.print("\n".repeat(2));
		
		//prompt user for there name
		System.out.println("please enter your name:");
		
		//read what user typed and store as userName			
		String usersNames = myObj.nextLine();	
		
		//create array to store the 20 instances of dice 
		rollsArray = new Dice[20];
		//loop over array and create an instance of dice for each
		for(int i = 0; i < rollsArray.length; i++ ) {
			
			//create value for current roll i + 1
			int currentRoll = i + 1;
			
			//create new dice instance and place in array at i value
			rollsArray[i] = new Dice(6);
			
			//Display Result of current roll
			System.out.println("roll " + currentRoll + ": " + rollsArray[i].getRollResut());
		}
		
		//display “Thank you for using the Dice Simulator, userName.
		System.out.println("Thank you for using the Dice Simulator, " + usersNames);
	}
}
