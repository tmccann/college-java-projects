package diceGamePackage;

import java.util.ArrayList;


public class RollASix {
	
	//class wide variable
	//dice
	private Dice dice;
	//score
	private int score;
	//roll result 
	private ArrayList<Integer> rollResult;

	public RollASix() {
		
		//create new instance of dice
		dice = new Dice();
		//create new ArrayList
		rollResult = new ArrayList<>();
	}
	
	public void playRollASix() {
		//reset score to 5
		score = 5;
		//display header
		displayHeader();
		//tryRoll a six
		tryRollASix();
		//display win  loose message
	}
	
	//Display header method
	private void displayHeader() {
		System.out.println("  Dice        Score  ");
		System.out.println("********    *********");
		System.out.println("    1           5    ");
	}
	
	private void tryRollASix() {
		//roll dice and get value
		int currentRoll = 0;
		//while loop while score 0 and roll result not 6 		
		while(score > 0 && currentRoll != 6) {
			//roll dice
			currentRoll = dice.rollDice();
			//if roll is not 6 -1 from score
			if(score != 6) {
				score--;
			}
			//add current roll to array
			rollResult.add(currentRoll);
			//display current roll value and score 
			System.out.println("    " + currentRoll + "           " + score);
		
		}
		
	}
}
