package diceGamePackage;

import java.util.Scanner;

public class GameController {
	
	//class wide variables
	private String userName;
	//scanner object to get user input 
	private Scanner userInput;
	//Create Simulator
	private DiceSimulator simulator;
	public GameController() {
		userInput = new Scanner(System.in);
		simulator = new DiceSimulator();
		
	}
	
	
	
	
	//start controller y
	public void start() {
		displayWelcomeMessage();
		enterUserName();
		startDiceSimulator();
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
	
	//start dice simulator 
	private void startDiceSimulator() {
		simulator = new DiceSimulator();
		simulator.playSimulator(userName);
		
	}	
	
	//returns current state of the object for testing and debugging 
	public String toString() {
		
		//return objects attributes 
		return "Username:" + userName;
	} 
	
	}
	


