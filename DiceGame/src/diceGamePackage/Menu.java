package diceGamePackage;

import java.util.Scanner;

public class Menu {
	
	//class wide variable 
	private Scanner userInput;
	
	
	public Menu (Scanner userInput) {
		// keep the Scanner handed in from GameController as Menu's own
		this.userInput = userInput;
	}
	
	
		public int selectGame() {
			//displayMenu
			displayMenu();
			//getUserSlection
			int selected = getUserSelection();
			// return user selection
			return selected;
		}
		
		private void displayMenu() {
			//Display menu
			System.out.println("======================================");
			System.out.println("              GAMES MENU              ");
			System.out.println("======================================");
			System.out.println(" 1. Dice Simulator                    ");
			System.out.println(" 2. Roll a Six                        ");
			System.out.println("--------------------------------------");
		}
		
		private int getUserSelection () {
			//prompt user to select game
			System.out.println(" Enter the number of your game: ");
			//store users input
			return  userInput.nextInt();
		}
}
