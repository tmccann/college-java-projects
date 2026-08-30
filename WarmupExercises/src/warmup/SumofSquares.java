package warmup;

public class SumofSquares {
	public static void result() {//find the "sum of the squares" of all the numbers from 1 to 100,
//initial value 1 and 100 
		int startNum = 1;
		int endNum = 100;
//initial sum value
		int sum = 0;
//Write a program to find the "sum of the squares" of all the numbers from 1 to 100, 
//i.e. (1*1) + (2*2) + (3*3) + ... + (100*100).
		//for loop to iterate over each value in range
		for(int i = startNum; i <= endNum; i++) {
			//square result = i * i
			int squareResult = i * i;
			//add current value to sum accumulator
			sum += squareResult;
//The program should also print the numbers and their squares out.
			//display result 
			System.out.println(i + " Squared equals:  " + squareResult);
		}
		System.out.println("***********************************");
		System.out.println("sum of Numers " + startNum + " to " + endNum + " is: " + sum);
		
	}
}
