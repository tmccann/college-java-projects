package javacheatsheet;

public class Types {
	  public static void runExamples() {

	        // ===== WHOLE NUMBERS =====

	        // int: the default whole-number type, fine for most everyday values
	        int age = 30;

	        // long: for whole numbers too big to fit in an int (bigger range)
	        // needs an 'L' on the end - without it, Java assumes you mean int,
	        // and this number is too big to be an int, so it won't compile
	        long population = 8000000000L;

	        // ===== DECIMAL NUMBERS =====

	        // double: the default decimal type in Java (used automatically
	        // if you don't say otherwise) - more precise, more commonly used
	        double price = 19.99;

	        // float: a smaller, less precise decimal type
	        // needs an 'f' on the end - without it, Java assumes you mean
	        // double, and won't let you squeeze a double into a float
	        float temperature = 36.6f;

	        // ===== SINGLE CHARACTER =====

	        // char: exactly ONE character, always in single quotes
	        char grade = 'A';

	        // ===== TRUE/FALSE =====

	        // boolean: only ever true or false, nothing else
	        boolean isStudent = true;

	        // ===== TEXT =====

	        // String: the only type that holds text - always double quotes
	        // (note the capital S - String is a class, not a primitive type
	        // like the others above it)
	        String name = "Tommy";
	        
	        // Regular variable - can be reassigned, camelCase naming
	        int studentAge = 30;
	        
	        // Constant - cannot be reassigned once set, SCREAMING_SNAKE_CASE naming
	        final int MAX_AGE = 100; 

	        // ===== PRINT THEM ALL OUT =====
	        // Java automatically converts each value to text when you
	        // join it with a String using +
	        System.out.println("int: " + age);
	        System.out.println("long: " + population);
	        System.out.println("double: " + price);
	        System.out.println("float: " + temperature);
	        System.out.println("char: " + grade);
	        System.out.println("boolean: " + isStudent);
	        System.out.println("String: " + name);
	        System.out.println("Regular Variable: " + studentAge);
	        System.out.println("Constant: " + MAX_AGE);
	    }
}


  
