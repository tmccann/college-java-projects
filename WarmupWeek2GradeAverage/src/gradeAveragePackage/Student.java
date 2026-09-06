package gradeAveragePackage;

import java.util.Scanner;

public class Student {
	//	Class wide variable declared here so available to all class methods
	private int id;
	private String name;
	private int score;
	//	Constructor build the class 
	//Student must know what type is being passed
	public Student(Scanner myObj, int id) {	
		name = "student" + id;
		//prompt user for the number of students,
		System.out.println("Please enter " + name + " grade: ");
		//Read input line save in numStudents variable. 
		int value = myObj.nextInt();
		while(value < 0   || value > 100) {
			System.out.println("Invalid score Please input again ");
			value = myObj.nextInt();
		}
		score = value;
	}
	

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	};
	
	
	
}
	

