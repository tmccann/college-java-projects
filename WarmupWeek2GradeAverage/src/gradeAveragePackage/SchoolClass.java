package gradeAveragePackage;

import java.util.Scanner;




public class SchoolClass {
	//	Class wide variable declared here so available to all class methods
	
	private int numStudents;
	private Student[] students;
	private int scoreTotal;
	private int minScore;
	private int maxScore;
	
	// Scanner opened here and call it myObject
	private Scanner myObj;
	
	//	Constructor build the class	
	public SchoolClass() { 
		 myObj = new Scanner(System.in);
		//prompt user for the number of students,
		System.out.println("Please input number of students in the class: ");
		
		//Read input line save in numStudents variable. 
		numStudents = myObj.nextInt();
		
		
		//create new grades array the same size as numStudents
		students = new Student[numStudents];
		
		//create individual student using for loop
		for(int i = 0; i <= numStudents - 1; i++) {
			int id = i+1;
			students[i] = new Student(myObj, id);
			
		 }
		
		//close scanner		
		myObj.close();
		
		// store min, max and total score 
		for(int i = 0; i < students.length; i++) {
			//get student score
			int currentValue =students[i].getScore();
			//if first run set min and max score to current value
			if(i == 0) {
				minScore = currentValue;
				maxScore = currentValue;
				//else 
			}else {
				//if current score under min score set to current value
				if(currentValue < minScore) {
					minScore = currentValue;
				}
				// if current score over max score set to current value
				if(currentValue > maxScore) {
					maxScore = currentValue;
				}
				
			}
			
			//add current value to score total
			scoreTotal += currentValue;
			
			
			}
		
		//calculate average score 
		int averageScore = scoreTotal / students.length;
		//output average message
		System.out.println("The average is " + averageScore);
		//output minScore
		System.out.println("The minimum is " + minScore);
		//output maxScore
		System.out.println("the maximum is " + maxScore);
	}


	


}
