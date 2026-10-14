package warmup;

public class GravityMoonVEarth {
	public static void result() {
		//run from 1 to 100 pounds.
		//initial value variables
		int minValue = 1;
		int maxValue = 100;
		//basic discription of output 
		String tableMessage = "Eath gravity effect on wieght resules displayed in pounds";
		//string length to variable 
		int messageLength = tableMessage.length();
		//Use messageLenth to repeat = so separator matches message string length 
		String headerSeparator = "=".repeat(messageLength);
		//out put message and separator 
		System.out.println(tableMessage);
		System.out.println(headerSeparator);
		
		// % marks the start of a format specifier
		// d = whole number (int/long) — no decimals possible
		// f = floating-point (float/double); precision goes BEFORE f, e.g. .2f = 2 decimal places
		// s = string		
		//display header
		System.out.printf("%8s%3s%8s%n", "Earth", "|" , "Moon");
		//For loop to iterate from min to max value
		for(int earthWeight = minValue; earthWeight <=maxValue; earthWeight++) {
		
			
			//The moon’s gravity is 17 percent that of Earth’s.
			// calculation used count * 0.17 
			double moonWeight = earthWeight * 0.17;
			//displays a table that shows Earth pounds and their equivalent moon weight.
			System.out.printf("%8d%3s%8.2f%n", earthWeight , "|" , moonWeight);
			//Output a line separator (==========================) every 25 pounds.
			//if earth weight / 25 = 0 print separator 
			if(earthWeight % 25 == 0) {
				String tableSeparator = "=".repeat(19);
				System.out.println(tableSeparator);
			}
			
		}
	}
}

