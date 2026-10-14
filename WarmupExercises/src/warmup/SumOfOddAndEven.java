package warmup;

public class SumOfOddAndEven {
	//accept upper an lower int as props
	public static void oddEvenSum(int lower, int upper) {
		//set count to lower value
		int count = lower;
		//set both oddSum and evenSum value to 0
		int evenSum = 0;
		int oddSum = 0;
		//check if number is odd or even
		do {
			if(count % 2 == 0) {
			//if count diveded by 2 and has no remaider add value to evenSum
			evenSum += count;				
		}else {
			//else add count to oddSUm
			oddSum += count;
		}
		//increment count by 1
		System.out.println(count);
		count++;
		//while count under or equal to upper
		}while(count <= upper);
			
		//displays results
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}

