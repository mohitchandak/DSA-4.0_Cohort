import java.util.Scanner;  // Import Scanner class

public class Input {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner obj = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int a = obj.nextInt();
        System.out.println("You entered integer: " + a);

        // Taking double input
        System.out.print("Enter a double value: ");
        double b = obj.nextDouble();
        System.out.println("You entered double: " + b);

        // Taking string input (nextLine())
        obj.nextLine(); // Consume the newline character from previous input
        System.out.print("Enter a string: ");
        String str = obj.nextLine();
        System.out.println("You entered string: " + str);

        // Taking boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean flag = obj.nextBoolean();
        System.out.println("You entered boolean: " + flag);

        // Taking character input
        System.out.print("Enter a character: ");
        char ch = obj.next().charAt(0);  // next().charAt(0) reads the first character of the input
        System.out.println("You entered character: " + ch);

        // Close the scanner when done
        obj.close();
    }
}
