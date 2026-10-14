package javacheatsheet;

public class LoopsDemo {

    public static void basicForLoop() {
        // for loop: runs a fixed number of times
        // setup (i=0) runs once, condition (i<5) checked each time,
        // increment (i++) runs after each pass
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop: " + i);
        }
    }

    public static void forEachLoop() {
        // for-each: loops through every item in an array/list directly
        // no counter needed - use this when you don't need the index
        int[] arr = {10, 20, 30};
        for (int n : arr) {
            System.out.println("for-each: " + n);
        }
    }

    public static void whileLoop() {
        // while: checks the condition BEFORE each pass
        // if the condition is false to start with, it never runs at all
        int i = 0;
        while (i < 5) {
            System.out.println("while loop: " + i);
            i++; // must update manually, or this loops forever
        }
    }

    public static void doWhileLoop() {
        // do-while: runs the body FIRST, checks the condition AFTER
        // guarantees at least one run, even if the condition starts false
        int i = 0;
        do {
            System.out.println("do-while loop: " + i);
            i++;
        } while (i < 5);
    }

    public static void breakExample() {
        // break: exits the loop immediately, skipping remaining iterations
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("break example: " + i);
        }
        // prints 0, 1, 2 then stops
    }

    public static void continueExample() {
        // continue: skips the rest of THIS iteration, moves to the next one
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("continue example: " + i);
        }
        // prints 0, 1, 3, 4 - skips 2, but keeps looping
    }

}