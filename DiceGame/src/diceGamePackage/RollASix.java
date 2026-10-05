package diceGamePackage;

public class RollASix {
	
	//global variable
	int score;
	Dice dice;

	public RollASix() {
		
		//create dice
		dice = new Dice();
		
	}
	
	public void playRollaSix (String userName) {
		
		//reset score 
		score = 5;
		
		//Display game header
		displayheader();
		
		//set current dice variable and do first roll
		int current = dice.rollDice();
		
		//use while loop to evaluate if a six is rolled and score over 0
		while(current != 6 && score != 0 ) {
			current = dice.rollDice();
			
			displayResult(current, score);
			//DO NOT minus 1 if winning score
			if(current != 6) {
			score--;
			}
		}
		//print last result if score = 0 
		if(score == 0) {
			displayResult(current, score);
		}
		
		//display win result
		displayWinLoseResult(userName, score);
	}
	
	private void displayheader () {
		
		//clear display
		System.out.print("\n".repeat(50));
		//Display game header 
		System.out.println("======================================");
		System.out.println("            ROLL A SIX                ");
		System.out.println("======================================");
		System.out.println("start dice game.");
	}
	
	private void displayResult (int current, int score) {
		
		//if first result display table header 
		if(score == 5) {
			System.out.println();
			System.out.println("  Rolled   " + "   Score  ");
			System.out.println("**********  *********");
		}
		System.out.println("     " + current + "          " + score);
		
	}
	
	private void displayWinLoseResult (String userName, int score) {
		
		//format userName to upperCase
		String userNameUpper = userName.toUpperCase();
		//if score equals zero display lose message
		if(score == 0) {
			System.out.println();
			System.out.println("================== " + userNameUpper +" YOU LOST ==================");
		}
		//else win message
		else {
			//correct score while loop does minus even with winning score
			System.out.println();
			System.out.println("****************** " + userNameUpper +" YOU WON *******************");
			System.out.println("Your score: " + score );
		}
		
	}	
	
}
