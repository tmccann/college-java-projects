package diceGamePackage;

import java.util.Arrays;
import java.util.Random;

public class DiceSimulator {
		
	//class wide variables 
	private int [] rollsArray;
	//Dice
	private Dice dice;
	//roll result
	private int rollResult;
	//random 
	private Random random;
	
	public DiceSimulator() {
		
		//create instance of dice class
		dice = new Dice();
		//create instance of rolls array
		rollsArray = new int[20];
		//create instance of random class
		random= new Random();
		
		}
		
	public void playSimulator (String userName) {
		
		//display game header 
		displayheader();
		//loop to repeat dice roll and display result 
		for(int i = 0; i < rollsArray.length; i++) { 
			//store current dice roll as number
			int number = i + 1;
			//store dice roll value as result 
			int result = dice.rollDice();
			//use displayResult to display current value to user 
			displayResult(number, result);
		}
		//display thank you for playing message 
		dispalyThankYou(userName);
	}
	
	private void displayResult (int roll, int result  ) {
		//variable for roll value formating
		String formatRoll;
		
		// if roll = 1 display result
		if(roll == 1) {
			
			//header for first line of display result
			
			System.out.println("=== Dice rolls Results ===");
		};
		//add space to roll number if single digit 
		if(roll < 10) {
		
			//if single digit add a space
			
			formatRoll = " " + Integer.toString(roll) ;
			
			//else display value
		}else {
			formatRoll = Integer.toString(roll);
		}
		//Display the Result of the roll
		System.out.println("Roll " + formatRoll + ": " + result );
	}
	
	
	
	private void displayheader () {
		
		//clear display
		System.out.print("\n".repeat(50));
		//Display game header 
		System.out.println("======================================");
		System.out.println("            DICE SIMULATOR            ");
		System.out.println("======================================");
	}
	
	
	private void dispalyThankYou (String UserName) {
		System.out.println("thank you for playing " + UserName);
	}
	
	
	//returns current state of the object for testing and debugging 
	
	public String toString () {
		
		//return objects attributes
		return "Roll results: " + Arrays.toString(rollsArray);
		
	}
	
}


