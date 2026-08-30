package warmup;

import java.util.ArrayList;

public class DivisableBySeven {
//	1. Write a program to sum the numbers from 111 to 8899,and compute the average.
	public static void calculateResults() {
		//create variable for initial values lowerNum, upperNum, sum, and count
		int lowerNum = 111;
		int upperNum = 8899;
		int sum = 0;
		int count = lowerNum;
		// initial value of oddSum
		int oddSum = 0;
		// initial value of divSevenSum
		int divSevenSum = 0;
		// Average dividers initial values
		int runCount = 0;
		int oddCount  = 0;
		int divSevenCount = 0;
		/* ArrayList to display divisible by 7 this could have been done within loop 
		 * an arrayList was chosen for more control on display */
		ArrayList<Integer> divSevenList = new ArrayList<Integer>(); 
		// While count less than or equal to upper limit
		while(count <= upperNum ) {
			//increment run count
			runCount++;
			// add count to current sum value of all numbers
			sum+=count;
//			2. Extend the program to sum only the odd numbers from 111 to 8899, and compute the average.
			//if number is odd add to oddSum
			if(count % 2 != 0) {
				//increment odd count
				oddCount++;
				//add count to odd sum
				oddSum += count;
			}
//			3. Extend the program to display those numbers from 111 to 8899 that are divisible by 7 with no remainder, and compute the average!
			//if count divisible by 7
			if(count % 7 == 0) {
				//increment divSeven count
				divSevenCount++;
				// add count to divSeven sum
				divSevenSum+=count;
				//add into divSevenList
				divSevenList.add(count);
				
			}
			//increment count 
			count++;
		}
		//calculate average
		double average =(double)sum / runCount;
		double oddAverage = (double)oddSum / oddCount;
		double divSevenAverage = (double)divSevenSum / divSevenCount;
		
		// Display results
		System.out.println("Accumulated value of range: " + sum);
		System.out.println("Average value of range: " + average);
		System.out.println("Accumulated value of odd range : " + oddSum);
		System.out.println("Average value of odd numbers: " + oddAverage);
		System.out.println("Accumulated value of divisable by 7 range : " + divSevenSum);
		System.out.println("Average value of divisable by 7 numbers: " + divSevenAverage);
		System.out.println("*******Values divisable by 7 numbers*********");
		
		//List array to store 10 ints for output
		String makeLine = "";
		//use lineCount to track how many numbers are on the current output line
		int lineCount = 0;
		for(int i = 0; i < divSevenList.size(); i++) {
			//increment line count
			lineCount++;
			//if on last item in list print line even if under 20
			if(i == divSevenList.size() - 1) {
				//add item to makeLine list
				makeLine = makeLine + "|" + divSevenList.get(i);
				//output line
				System.out.println(makeLine);
				//else if make lineCount under 20 
			}else if(lineCount < 20) { 
				//add current value to string
				makeLine = makeLine + "|" + divSevenList.get(i);
			//else output line and clear
			}else {
				makeLine = makeLine + "|" + divSevenList.get(i);
				System.out.println(makeLine);
				//reset make line to empty string 
				makeLine = "";
				//clear line count
				lineCount = 0;
			}
		}
	}
}
