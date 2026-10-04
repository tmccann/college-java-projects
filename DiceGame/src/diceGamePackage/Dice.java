package diceGamePackage;

import java.util.Random;

public class Dice {
		
	//class wide variable
	int rollResult;
	
	Random random;
	
	public Dice() {
		
		
		
	}
	
	public int rollDice() {
		// Creating the instance of Random class
		random= new Random();	
		
		//generate random number that matches dice size	        
		rollResult = random.nextInt(6) + 1;
		//return roll value
		return rollResult;
       
	}
	
	public String toString() {
	//return objects attributes 
		return "Roll Result is " + rollResult;
	}
}
