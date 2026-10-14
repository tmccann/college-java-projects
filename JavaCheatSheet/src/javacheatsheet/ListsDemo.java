package javacheatsheet;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
    // Lists are resizable - unlike arrays, they can grow and shrink
    // Can only hold objects, not primitives directly
    // (int becomes Integer, double becomes Double - Java handles this "boxing" automatically)

    public static void basicList() {
        // declare an empty, resizable list of Integers
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Empty list: " + list);
    }

    public static void addToList() {
        ArrayList<Integer> list = new ArrayList<>();

        // add() puts a new value on the end
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After adding: " + list);
    }

    public static void accessAndUpdate() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // get(index) reads a value - indexing starts at 0, same as arrays
        System.out.println("First value: " + list.get(0));

        // set(index, value) updates a value at that position
        list.set(0, 99);
        System.out.println("After update: " + list);
    }

    public static void removeFromList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // remove(index) deletes the value at that position
        // (careful: remove(int) removes BY INDEX, not by value - a common trip-up)
        list.remove(0);
        System.out.println("After removing index 0: " + list);
    }

    public static void listSize() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        // size() not length - Lists use a method here, with brackets
        System.out.println("Size: " + list.size());
    }

    public static void loopThroughList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // for-each loop - same style as arrays
        for (int n : list) {
            System.out.println("Value: " + n);
        }
    }

    public static void containsValue() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        // contains() checks if a value exists in the list - returns true/false
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Contains 99: " + list.contains(99));
    }

}
