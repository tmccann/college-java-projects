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
		//clear array list 
		rollResult.clear();
		//display header
		displayHeader();
		//tryRoll a six
		playRounds();
		//display win  loose message
		displayEndGameMessage();
	}
	
	//Display header method
	private void displayHeader() {
		System.out.println("  Dice        Score  ");
		System.out.println("********    *********");
		System.out.println("    1           5    ");
	}
	
	private void playRounds() {
		//roll dice and get value
		int currentRoll = 0;
		//while loop while score 0 and roll result not 6 		
		while(score > 0 && currentRoll != 6) {
			//roll dice
			currentRoll = dice.rollDice();
			//if roll is not 6 -1 from score
			if(currentRoll != 6) {
				score--;
			}
			//add current roll to array
			rollResult.add(currentRoll);
			//display current roll value and score 
			System.out.println("    " + currentRoll + "           " + score);
		}		
	}
	
	private void displayEndGameMessage() {
		//insert blank line for display format
		System.out.println("");
		//if score over 0 display winning message and score
		if(score > 0) {
			
			System.out.println("You win! Your score is " + score + ".");
		}
		//else display loser message
		else {
			System.out.println("Youn Lose!");
		}
	}
}
