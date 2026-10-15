package diceGamePackage;

import java.util.Arrays;

public class DiceSimulator {
	//class wide variables
	//Dice
	private Dice dice;
	//save roll history 
	private int [] rollResults;
	
	
	
	
	public DiceSimulator() {
		//create new instance of dice
		dice = new Dice();
		//create a new array size 20 to store 
		rollResults = new int[20];
	}
	
	// method to play dice simulator 
		public void playDiceSimulator(String userName) {
			// display game header
			displayHeader();
			//roll dice 20 times and display results
			rollTwentyTimes();
			//display end message
			displayGameEndMessage(userName);

	}
		
	//method to repeat roll 20 times and store each result in array
	private void rollTwentyTimes () {
		//create a loop to repeat 20 times(length of rollResults Array)
		for(int rollNum = 0; rollNum < rollResults.length; rollNum ++ ) {
			
			//roll dice and store result
			rollResults[rollNum] = dice.rollDice();
			
			//display result
			displayRollResult(rollNum,rollResults[rollNum]);
		}
		
		
	}
	
	//add game header to display name of game
	private void displayHeader () {
		
		//clear display
		System.out.print("\n".repeat(5));
		//Display game header 
		System.out.println("======================================");
		System.out.println("            DICE SIMULATOR            ");
		System.out.println("======================================");
		//add gap for visual effect only
		System.out.println(" ");
	}
	
	//method to display each individual roll result
	private void displayRollResult (int rollNum, int rollValue) {
		//rollNum is the array position so add 1 to reflect roll number
		int roll = rollNum + 1;
		//if first roll display header 
		if(roll == 1) {
			System.out.println("=== Dice rolls Results ===");
		}
			//Display the Result of the roll
			//rollResult default display
			String rollDisplay = "Roll ";
			// if roll number a single digit add space to rollDisplay 
			if(roll < 10) {
				rollDisplay = "Roll  ";
			}
			//display result
			
			System.out.println( rollDisplay + roll + ": " + rollValue );
			
	}
	
	//method display game end message receives userName
	private void displayGameEndMessage (String userName) {
		//add space between results and message
		System.out.println("");
		//display message including userName
		System.out.println( userName + " thank you for playing dice simulator");
	}
	
	//provides a summary of what DiceSimulator object holds
	public String toString() {
		return "Roll Results: " + Arrays.toString(rollResults);
	}
	
}
