package diceGamePackage;

import java.util.Random;

public class Dice {
		
	//class wide variable
	int roll;
	
	public Dice(int size) {
		//set dice size
		int diceSize = size;	
		
		// Creating the instance of Random class
		Random r= new Random();	
		
		//generate random number that matches dice size	        
		 roll = r.nextInt(diceSize) + 1;
	}
	
	public int getRollResut() {
		
		//return roll value
		return roll;
       
	}
}
