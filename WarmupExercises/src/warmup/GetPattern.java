package warmup;

public class GetPattern {
	
	public static void getPatternResulr() {
		
		//initial value for pattern repeat
		int number = 5;
		
		//FOR loop to create the number of rows
		for(int row = 1; row <= number; row++) {
			//NESTED loop to create number of columns
			for(int column = 1; column <= number ; column++) {
				//populate the row with a "# " per iteration 
				System.out.print("# ");
			}
			//new line per iteration
			System.out.println();
		}
	}
	
}
