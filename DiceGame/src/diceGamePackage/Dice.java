package diceGamePackage;

import java.util.Random;

public class Dice {
	//class wide variable
	//random 
	private Random random;
	//roll result
	private int rollResult;
	
	public Dice () {
		random = new Random();
	}
	
	//Roll dice and return result
	public int rollDice () {
		
		//generate random number nextInt gives result of 0 - 5 so add 1 for 1-6
		rollResult = random.nextInt(6) + 1;
		//return rollResult
		return rollResult;
	}
	
	//provides a summary of what dice object holds
	public String toString() {
		return "Roll Result: " + rollResult;
	}
}
