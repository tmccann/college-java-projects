package diceGamePackage;

import java.util.Scanner;

public class GameController {
	//class wide variable
		//Dice simulator game
		private DiceSimulator simulator;
		//read users input
		private Scanner userInput;
		//store users input
		private String userName;
		
		public GameController() {
			//create new instances of scanner and dice simulator
			userInput = new Scanner(System.in);
			simulator = new DiceSimulator();
		}
		
		//public method to play dice simulator
		public void startSession() {
			//call display welcome message 
			displayWelcomeMessage();
			//call get user name 
			getUserName();
			//call dice simulator passing user name
			simulator.playDiceSimulator(userName);
			//TEST un-comment to show what the controller holds
//			System.out.println(simulator.toString()); 
		}
		
		//private method to display welcome message 
		private void displayWelcomeMessage() {
			System.out.println("======================================");
			System.out.println("        WELCOME TO DICE GAMES!        ");
			System.out.println("======================================");
		}
		
		
		//private method to get use rName
		private void getUserName() {			
			//prompt user to input user name
			System.out.println("please enter your name to continue");
			//read and store users input 
			userName = userInput.nextLine();	
		}
		
		//provides a summary of what GameController object holds
		public String toString() {
			//return userNamwe
			return "userName: " + userName;
		}
		
}



