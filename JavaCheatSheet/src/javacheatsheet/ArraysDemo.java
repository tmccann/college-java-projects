package javacheatsheet;

import java.util.Arrays;

public class ArraysDemo {
//		Arrays are a set size this cannot change once created 
	  public static void basicArray() {
	        // declare an array with default values
	        // (numbers default to 0, unlike Lists which start empty)
	        int[] arr = new int[5];
	        System.out.println("Default array: " + Arrays.toString(arr));
	    }

	    public static void arrayWithValues() {
	        // declare an array with values already set
	        int[] arr = {10, 20, 30};
	        System.out.println("Array with values: " + Arrays.toString(arr));
	    }

	    public static void accessAndUpdate() {
	        int[] arr = {10, 20, 30};

	        // access a value by index - indexing starts at 0
	        System.out.println("First value: " + arr[0]);

	        // update a value by index
	        arr[0] = 99;
	        System.out.println("After update: " + Arrays.toString(arr));
	    }

	    public static void arrayLength() {
	        int[] arr = {10, 20, 30};

	        // .length is a property here, NOT a method - no brackets
	        // (unlike String, which uses .length() with brackets)
	        System.out.println("Length: " + arr.length);
	    }

	    public static void loopThroughArray() {
	        int[] arr = {10, 20, 30};

	        // for-each loop - the one you'll use most day-to-day
	        // reads as: "for each int n in arr, do this"
	        for (int n : arr) {
	            System.out.println("Value: " + n);
	        }
	    }

	    public static void sortArray() {
	        int[] arr = {30, 10, 20};

	        // sorts the array in place (changes the original, no need to reassign)
	        Arrays.sort(arr);
	        System.out.println("Sorted: " + Arrays.toString(arr));
	    }
	
}
