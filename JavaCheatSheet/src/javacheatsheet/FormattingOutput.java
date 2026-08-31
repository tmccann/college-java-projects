package javacheatsheet;

public class FormattingOutput {

	public static void examples() {

		// ===================================================
		// Format specifier structure:
		// %[width][.precision]conversion
		//
		// width      - optional. Minimum characters to pad to (right-aligns by default)
		// .precision - optional. Meaning depends on conversion type (see below)
		// conversion - REQUIRED. Tells Java what type of value to expect.
		//              Without a conversion letter, the specifier is incomplete.
		// ===================================================

		// -------------------------
		// %d - whole numbers (int, long)
		// No decimals possible. Precision is NOT valid with %d.
		// -------------------------
		int wholeNumber = 42;
		System.out.printf("%d%n", wholeNumber);      // 42
		System.out.printf("%8d%n", wholeNumber);     // "      42"  (padded to width 8)

		// -------------------------
		// %f - floating point (float, double)
		// Precision here means "how many decimal places to show"
		// Default precision (if omitted) is 6 decimal places
		// -------------------------
		double decimalNumber = 17.0;
		System.out.printf("%f%n", decimalNumber);     // 17.000000
		System.out.printf("%.2f%n", decimalNumber);   // 17.00      (precision only)
		System.out.printf("%8.2f%n", decimalNumber);  // "   17.00" (width 8, precision 2)

		// -------------------------
		// %s - Strings
		// Precision here means "max characters to show" (truncates, does not pad)
		// -------------------------
		String word = "Moon";
		System.out.printf("%s%n", word);      // Moon
		System.out.printf("%8s%n", word);     // "    Moon" (padded to width 8)

		// -------------------------
		// %n - newline (platform-independent, preferred over \n in printf/format)
		// -------------------------

		// -------------------------
		// Multiple specifiers in one call - useful for building table rows/columns
		// Arguments are matched to specifiers in order
		// -------------------------
		int earthPounds = 100;
		String separatorChar = "|";
		double moonWeight = 17.00;
		System.out.printf("%8d%3s%8.2f%n", earthPounds, separatorChar, moonWeight);

		// -------------------------
		// printf vs String.format
		// Both use identical syntax and specifiers.
		// printf   -> formats AND prints immediately. No return value.
		// String.format -> formats and RETURNS a String. Doesn't print by itself.
		//                   Useful when you need to store, reuse, or build up text
		//                   before deciding when/how to display it.
		// -------------------------
		String formattedLine = String.format("%8d%3s%8.2f", earthPounds, separatorChar, moonWeight);
		System.out.println(formattedLine); // prints the same result, but as a separate step

		// -------------------------
		// Repeating a character - handy for building separator lines
		// -------------------------
		String fixedSeparator = "=".repeat(19); // fixed length, hardcoded
		System.out.println(fixedSeparator);

		String headerText = "Earth vs Moon Weight";
		String dynamicSeparator = "=".repeat(headerText.length()); // length always matches headerText
		System.out.println(headerText);
		System.out.println(dynamicSeparator);
		// Dynamic version stays correct even if headerText or column widths change later -
		// no need to remember to manually update a hardcoded number elsewhere in the code.
	}
}
