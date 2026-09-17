package diceGamePackage;

import java.util.Random;

public class Dice {
		
	//class wide variable
	int rollResult;
	
	public Dice() {
	
		
		
	}
	
	public int getRollResut() {
		// Creating the instance of Random class
		Random r= new Random();	
		
		//generate random number that matches dice size	        
		rollResult = r.nextInt(6) + 1;
		//return roll value
		return rollResult;
       
	}
	
	public String toString() {
	//return information of what is held in dice object
	return "Roll Result is " + rollResult;
	}
}
