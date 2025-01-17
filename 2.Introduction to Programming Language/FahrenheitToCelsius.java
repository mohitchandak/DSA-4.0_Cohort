//Convert a temperature from Fahrenheit to Celsius

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double fahrenheit = obj.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.2f", celsius);
        obj.close();
    }
}
