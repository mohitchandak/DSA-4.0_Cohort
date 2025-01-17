//Find area and perimeter of rectangle.

import java.util.Scanner;

public class Rectangle {
    public static void main (String [] arg){
        Scanner obj  =  new Scanner(System.in);
        int length =  obj.nextInt();
        int breath = obj.nextInt();

        long area =  length*breath;
        long perimeter = 2*(length+breath);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
