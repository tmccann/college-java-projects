package warmupExWeek2Package;

public class CheckerBoard {
	
	public static void createBoard() {
		
		//initial value for pattern repeat
		int number = 7;
		
		//FOR loop to create the number of rows
		for(int row = 1; row <= number; row++) {
			//IF row value is even 
			if(row % 2 == 0) {
				//ADD space at start of row
				System.out.print(" ");
			}			
			
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
