import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {

        // Integer variable (stores whole numbers)
        int intVar = 100;  // int can store values from -2,147,483,648 to 2,147,483,647
        System.out.println("Integer value: " + intVar);

        // Long variable (stores larger whole numbers)
        long longVar = 100000L;  // long can store values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long value: " + longVar);

        // Float variable (stores decimal values)
        float floatVar = 10.5f;  // float can store values from approximately -3.40282347E+38 to 3.40282347E+38
        System.out.println("Float value: " + floatVar);

        // Double variable (stores larger decimal values)
        double doubleVar = 100.99;  // double can store values from approximately -1.7976931348623157E+308 to 1.7976931348623157E+308
        System.out.println("Double value: " + doubleVar);

        // Char variable (stores a single character)
        char charVar = 'A';  // char can store a single character or symbol (unicode)
        System.out.println("Char value: " + charVar);

        // Boolean variable (stores true or false)
        boolean boolVar = true;  // boolean can store only true or false
        System.out.println("Boolean value: " + boolVar);

        // String variable (stores text)
        String strVar = "Hello, Java!";  // String is not a primitive data type, but a reference type that stores text
        System.out.println("String value: " + strVar);

    }
}
