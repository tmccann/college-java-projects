package javacheatsheet;

import java.lang.reflect.Array;
//Scanner must be imported for inputs
import java.util.Scanner;

public class ScannerDemo {
//	user inputs there user name
	public static String greetUser() {
		//create input object
		Scanner myObj = new Scanner(System.in);
		//ask user for first and surName 
		String inputMessage = "please eneter your full name (eg Joe Bloggs): ";
		System.out.println(inputMessage);
		//read what user typed and store as userName			String usersNames = myObj.nextLine();	
				
	}

	
	
//display welcome message with first name only	
	public static void welcomeMsg(String usersNames) {
		//split the usersNames string 
		String[] arr = usersNames.split(" ");
		//return first name only
		System.out.println("Hi " + arr[0]);
	}
	
	public static boolean isValid(String usersNames) {
		//spilt string into Array of strings
		String[] parts = usersNames.split(" ");
		if(parts.length >= 2) {
			return true ;
		} else return false;
	}
		

}
