package warmup;

public class OddEven {
	//accept lower and upper int props
	public static void printNumbers(int lower, int upper) {
		//set count to lower limit 
		int count = lower;
		//While count is lower or equal to upper limit 
		while(count <= upper ) {
			//if count diveded by 2 = 0 output EVEN message
			if(count % 2 == 0 ) {
				System.out.println("The number is " + count + " and it is even");	
				
			} else {
				System.out.println("The number is " + count + " and it is odd");
				}
		count++;
		}
	}
}
