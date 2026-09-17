package diceGamePackage;

import java.util.Scanner;

public class GameController {
	
	//class wide variables
	private int [] rollsArray;
	private String userName;
	
	public GameController() {
		
		
		//create input object
		Scanner myObj = new Scanner(System.in);
		
		//Welcome message 
		System.out.println("************ WELCOME TO THE DICE SIMULATOR **************");
		System.out.println("*                                                       *");
		System.out.println("* I will roll the dice 20 time and give you the result. *");
		System.out.println("*                                                       *");
		System.out.println("*********************************************************");
		
		//prompt user for there name
		System.out.println("please enter your name:");
		
		//read what user typed and store as userName			
		userName = myObj.nextLine();	
		Dice currentDice = new Dice();
		//create array to store the 20 instances of dice 
		rollsArray = new int [20];
		//loop over array and create an instance of dice for each
		for(int i = 0; i < rollsArray.length; i++ ) {
			
			//create value for current roll i + 1
			int currentRoll = i + 1;
			
			//create new dice instance and place in array at i value
			rollsArray[i] = currentDice.getRollResut();
			
			//Display Result of current roll
			System.out.println("roll " + currentRoll + ": " + rollsArray[i]);
		}
		//display “Thank you for using the Dice Simulator, userName.
		System.out.println("Thank you for using the Dice Simulator, " + userName);
		
		//dice toString method has been included in dice  uncomment if required 
		//System.out.println(currentDice);
		
		}
	
	public String toString() {
		
		// create variable outside loop to hold userName and each value held in the array
		String objString = "users name is: " + userName + "\n";
		//loop over rolls array to returned each result in a string 
		for(int i = 0; i < rollsArray.length; i++ ) {
			int rollNum = i + 1;
			//insert array value into string 
			objString += "Roll " + rollNum + " : " + rollsArray[i] +  " , ";
			}
		return objString;
}	
}
