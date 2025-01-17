public class TypecastingExample {
    public static void main(String[] args) {

        // Widening (Implicit) Casting
        int intVar = 100;
        long longVar = intVar;  // int to long (widening)
        System.out.println("Widening casting: int " + intVar + " to long " + longVar);

        float floatVar = intVar;  // int to float (widening)
        System.out.println("Widening casting: int " + intVar + " to float " + floatVar);

        double doubleVar = intVar;  // int to double (widening)
        System.out.println("Widening casting: int " + intVar + " to double " + doubleVar);

        // Narrowing (Explicit) Casting
        double largeDouble = 9.99;
        int narrowedInt = (int) largeDouble;  // double to int (narrowing)
        System.out.println("Narrowing casting: double " + largeDouble + " to int " + narrowedInt);

        float largeFloat = 15.75f;
        int narrowedIntFromFloat = (int) largeFloat;  // float to int (narrowing)
        System.out.println("Narrowing casting: float " + largeFloat + " to int " + narrowedIntFromFloat);

        // Narrowing might lose data if the range is too large or precision is lost
        long largeLong = 10000000000L;
        int narrowedIntFromLong = (int) largeLong;  // long to int (narrowing)
        System.out.println("Narrowing casting: long " + largeLong + " to int " + narrowedIntFromLong);

    }
}
