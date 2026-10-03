package diceGamePackage;

import java.util.Random;

public class Dice {
		
	//class wide variable
	int rollResult;
	
	Random r;
	
	public Dice() {
		
		
		
	}
	
	public int rollDice() {
		// Creating the instance of Random class
		r= new Random();	
		
		//generate random number that matches dice size	        
		rollResult = r.nextInt(6) + 1;
		//return roll value
		return rollResult;
       
	}
	
	public String toString() {
	//return objects attributes 
		return "Roll Result is " + rollResult;
	}
}
