package diceGamePackage;

import java.util.Scanner;

public class GameController {
	//class wide variable
		//menu
		private Menu menu;
		//Dice simulator game
		private DiceSimulator simulator;
		//roll a six
		private RollASix rollASix;
		//roll a double
		private RollADouble rollADouble;
		//read users input
		private Scanner userInput;
		//store users input
		private String userName;
		//choice
		private int choice;
		
		public GameController() {
			//create new instances of scanner and dice simulator
			userInput = new Scanner(System.in);
			simulator = new DiceSimulator();
			//create instance of menu 
			menu = new Menu(userInput);
			//create instance of roll a six
			rollASix = new RollASix();
			//create instance of roll a double
			rollADouble = new RollADouble();
		}
		
		//public method to play dice simulator
		public void startSession() {
			//call display welcome message 
			displayWelcomeMessage();
			//call get user name 
			getUserName();
			//ask menu for players choice 
			choice = menu.selectGame();
			playSelectedGame();
			//TEST un-comment to show what the controller holds
//			System.out.println(simulator.toString()); 
//			System.out.println(rollASix.toString());
//			System.out.println(rollADouble.toString());
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
		
		
		//private method to select game
		private void playSelectedGame () {
			switch(choice) {
			
			//case one play diceSimulator
			case 1:
				simulator.playDiceSimulator(userName);
				break;
			//case 2 play rollASix
			case 2:
				rollASix.playRollASix();
				break;
			//case 3 play rollADouble
			case 3:
				rollADouble.playRollADouble();
				break;
			//default message if invalid choice
			default:
				System.out.println("invalid choice please start over");
				break;
			}
		}
		//provides a summary of what GameController object holds
		public String toString() {
			//return userName and choices
			return "userName: " + userName + "\n" + "choice: " + choice;
		}
		
}
