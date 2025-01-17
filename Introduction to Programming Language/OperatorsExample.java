public class OperatorsExample {
    public static void main(String[] args) {

        // Arithmetic operators
        int a = 10;
        int b = 3;

        int addition = a + b;  // 10 + 3 = 13
        int subtraction = a - b;  // 10 - 3 = 7
        int multiplication = a * b;  // 10 * 3 = 30
        int division = a / b;  // 10 / 3 = 3 (integer division)
        int modulus = a % b;  // 10 % 3 = 1 (remainder of division)

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Assignment operators
        int x = 20;

        // Using +=
        x += 5;  // x = x + 5 => x = 25
        System.out.println("x after += 5: " + x);

        // Using -=
        x -= 10;  // x = x - 10 => x = 15
        System.out.println("x after -= 10: " + x);

        // Using *=
        x *= 2;  // x = x * 2 => x = 30
        System.out.println("x after *= 2: " + x);

        // Using /=
        x /= 5;  // x = x / 5 => x = 6
        System.out.println("x after /= 5: " + x);

        // Using %=
        x %= 4;  // x = x % 4 => x = 2
        System.out.println("x after %= 4: " + x);
    }
}
