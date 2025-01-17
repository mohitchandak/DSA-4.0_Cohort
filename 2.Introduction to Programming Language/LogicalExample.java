public class LogicalExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean condition1 = a > 5;   // true
        boolean condition2 = b < 10;  // true
        boolean condition3 = a < 5;   // false

        // Logical AND (&&)
        System.out.println("condition1 && condition2: " + (condition1 && condition2));  // true

        // Logical OR (||)
        System.out.println("condition1 || condition3: " + (condition1 || condition3));  // true

        // Logical NOT (!)
        System.out.println("!condition3: " + !condition3);  // true (since condition3 is false)
    }
}
