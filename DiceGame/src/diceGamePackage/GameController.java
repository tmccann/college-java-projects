package diceGamePackage;

import java.util.Scanner;

public class GameController {
	
	//class wide variables
	private String userName;
	//scanner object to get user input 
	private Scanner userInput;
	//create menu
	private Menu menu;
	//Create Simulator
	private DiceSimulator simulator;
	//Create rollASix
	private RollASix rollASix;
	
	
	public GameController() {
		
		userInput = new Scanner(System.in);
		menu = new Menu(userInput);
		simulator = new DiceSimulator();
		rollASix = new RollASix();
		
	}
	
	
	
	
	//start controller y
	public void start() {
		displayWelcomeMessage();
		enterUserName();
		int selected = startMenu();
		playSelectedGame(selected);
		}
	
	//display welcome message
	private void displayWelcomeMessage() {
		System.out.println("======================================");
		System.out.println("        WELCOME TO DICE GAMES!        ");
		System.out.println("======================================");
	}
	
	//get user Name
	private void enterUserName (){
		//prompt user to input user name
		System.out.println("please enter your name to continue");
		//get inputed user name 
		userName= userInput.nextLine();
	}
	
	//start Menu 
	private int startMenu() {
		return menu.startMenu();
		
	}	
	
	//play selected game
	private void playSelectedGame (int selected) {
		
		//use switch to select game 
		switch(selected) {
		
		case 1:
			simulator.playSimulator(userName);
			break;
		
		case 2:
			rollASix.playRollaSix(userName);
			break;
		
		default:
			System.out.println("invalid choice");
		}
		
	}
	
	//returns current state of the object for testing and debugging 
	public String toString() {
		
		//return objects attributes 
		return "Username:" + userName;
	} 
	
}
	


