package warmup;

public class GetPattern {
	
	public static void getPatternResulr() {
		
		int number = 5;
		
		for(int row = 1; row <= number; row++) {
			
			for(int column = 1; column <= number ; column++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
}
