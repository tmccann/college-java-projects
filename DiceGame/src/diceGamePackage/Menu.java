package diceGamePackage;

import java.util.Scanner;

public class Menu {
	
	//class wide variable
	private Scanner userInput;
	
	
	public Menu (Scanner userInput) {
		this.userInput = userInput;
	}
	
	public int startMenu () {
		//display menu 
		displayMenu();
		
		//get user input 
		int selected = getUserSelection();
		
		//return selected 
		return selected;
		
	}
	
	
	private void displayMenu () {
		
		//Display menu
		System.out.println("======================================");
		System.out.println("              GAMES MENU              ");
		System.out.println("======================================");
		System.out.println(" 1. Dice Simulator                    ");
		System.out.println(" 2. Roll a Six                        ");
		System.out.println(" 3. Roll a Double                        ");
		System.out.println("--------------------------------------");
		

	}
	
	private int getUserSelection () {
		
		//prompt user to select a game
		System.out.println(" Enter the number of your game: ");
		//store users input
		return  userInput.nextInt();
		
	}	
}

