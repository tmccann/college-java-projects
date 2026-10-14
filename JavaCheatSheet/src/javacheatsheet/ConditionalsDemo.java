package javacheatsheet;

public class ConditionalsDemo {

    public static void ifElseIfElse() {
        // if / else if / else: checks conditions top to bottom,
        // runs the FIRST one that's true, skips the rest
        int age = 20;

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }

    public static void logicalOperators() {
        // && (AND) - both sides must be true
        // || (OR) - at least one side must be true
        // !  (NOT) - flips true/false
        int age = 20;
        boolean isStudent = true;

        if (age >= 18 && isStudent) {
            System.out.println("Adult student");
        }

        if (age < 13 || age > 65) {
            System.out.println("Discount eligible");
        } else {
            System.out.println("No discount");
        }

        if (!isStudent) {
            System.out.println("Not a student");
        }
    }

    public static void ternaryOperator() {
        // ternary: shorthand for a simple if/else that assigns a value
        // condition ? valueIfTrue : valueIfFalse
        int age = 20;
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary result: " + category);
    }

    public static void switchStatement() {
        // switch: cleaner than a long if/else-if chain when checking
        // ONE variable against many possible fixed values
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
                break;
        }
        // break stops it falling through into the next case -
        // forgetting break is a classic Java bug
        System.out.println("Switch result: " + dayName);
    }

    public static void switchExpression() {
        // newer switch expression style (Java 14+) - shorter, no break needed,
        // arrow (->) directly returns/assigns the value
        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
        System.out.println("Switch expression result: " + dayName);
    }

}