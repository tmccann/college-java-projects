package NumberGuessPackage;

import java.util.Scanner;

public class NumberGuess {

	
	//play game method
	public void playGame() {
		
		//create scanner object
		Scanner myObj = new Scanner(System.in); 
		
		// generate random number between 0-99
		int secretNumber =  (int)(Math.random()*100);
		
		//ask user to input a number
		System.out.println("Please input your guess: ");
		
		//get number from input line
		int usersGuess = myObj.nextInt(); 
		int n = 0;
		
		//while loop to evaluate number
		while(usersGuess != secretNumber ) {
			
			//if message is higher display Try higher increment n
			if(usersGuess < secretNumber) {
				
				//display message
				System.out.println("Try Higher");
				
				//increment n
				n++;
				
				//get number from input line
				usersGuess = myObj.nextInt(); 
				
			//else display message Try Lower increment n
			}else {
				
				//display message
				System.out.println("Try Lower");
				
				//increment n
				n++;
				
				//get number from input line
				usersGuess = myObj.nextInt(); 
			}
			
		}
		//number equals secret number display You got it in n tries
		n++;
		System.out.println("You got it in " + n + " tries");
	}
	

	
	
	

	
}
