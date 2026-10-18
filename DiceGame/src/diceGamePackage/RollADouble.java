package diceGamePackage;

public class RollADouble {
	
	//class wide variables
	//dice 1
	private Dice dice1;
	//dice 2
	private Dice dice2;
	//score
	private int score;
	//dice 1 results array
	private int[] dice1Results;
	//dice 2 results array
	private int[] dice2Results;
	
	public RollADouble () {
		//create dice 1 instance
		dice1 = new Dice();
		//create dice 2 instance
		dice2 = new Dice();
		//create dice 1 results array size 3
		dice1Results = new int[3];
		//create dice 2 results array size 3
		dice2Results = new int[3];
	}
	
	//play roll a double
	public void playRollADouble() {
		//reset score to 0
		score = 0;
		displayHeader();
		rollThreeTimes();
		scoreMessage();
		
	}
	
	//display header
	private void displayHeader() {
		System.out.println("  Dice 1        Dice 2  ");
		System.out.println("**********    **********");
	}
	
	//loop to roll dice 3 times
	private void rollThreeTimes() {
		//loop to roll dice 1 and dice 2 three times
		for(int rollNum = 0; rollNum < dice1Results.length; rollNum++ ) {
			
			//roll dice 1 and store result
			dice1Results[rollNum] = dice1.rollDice();
			//roll dice 2 and store result
			dice2Results[rollNum] = dice2.rollDice();
			//IF dice 1 and dice 2 result the same add 1 to score
			if(dice1Results[rollNum] == dice2Results[rollNum]) {
				//add 1 to score
				score++;
			}
			//display result of both rolls
			System.out.println("     " +  dice1Results[rollNum] + "             " + dice2Results[rollNum] );
		}
	}
	
	//display score message
	private void scoreMessage(){
		//formatting add space
		System.out.println("");
		//display players score
		System.out.println("Your score = " + score);
	}
	
	public String toString() {
		//create string 
		String summary = "Score:" + score + "\n";
		//loop to add result to string 
		for(int count = 0; count < dice1Results.length; count++ ) {
			//add 1 to count for roll number
			int rollNum = count + 1;
			//add current values to string 
			summary += "roll " + rollNum + ": " + dice1Results[count] + " " + dice2Results[count] + "\n";
			}
		return summary;
	}
}
