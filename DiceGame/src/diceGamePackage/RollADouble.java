package diceGamePackage;



public class RollADouble {
	
	//class wide variables
	int score;
	Dice dice1;
	Dice dice2;
	
	public RollADouble () {
		
		//create dice1
		dice1 = new Dice();
		//create dice2
		dice2 = new Dice();
	}
	
	public void playRollADouble(String useName) {
		
		//set score to 0
		score = 0;
		
		//Display game header
		displayheader();
		//for loop repeat 3 times
		for(int i = 0; i < 3; i++) {
			//If i = zero display table header
			if(i == 0) {
				System.out.println();
				System.out.println("  Dice 1       Dice 2");
				System.out.println("**********   **********");				
			}
			
			//roll dice 1 as current1
			int current1 = dice1.rollDice();
			//roll dice 2 as current2
			int current2 = dice2.rollDice();
			
			//display result of rolls 
			displayResult(current1, current2);
			if(current1 == current2) {
				score++;
				}			
		}
		dispalyThankYou(useName, score);
	}
	
	private void displayheader () {
		
		//clear display
		System.out.print("\n".repeat(50));
		//Display game header 
		System.out.println("======================================");
		System.out.println("            ROLL A DOUBLE             ");
		System.out.println("======================================");
	}
	
	private void displayResult (int current1, int current2 ) {
		
		System.out.println("    " + current1 + "             " + current2);
	}
	
	private void dispalyThankYou (String UserName, int score) {
		System.out.println("thank you for playing " + UserName);
		System.out.println("Your score: " + score);
	}
}
