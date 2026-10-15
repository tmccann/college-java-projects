package diceGamePackage;

public class Main {

	public static void main(String[] args) {
		
		// Create instance of dice controller
		GameController playGames = new GameController();
		
		//start new session
		playGames.startSession();
		
		//TEST un-comment to show what the controller holds
//		System.out.println(playGames.toString());
		}
	
	
}
