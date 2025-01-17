//Calculate total average and percentage of five subjects

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sub1 = obj.nextInt();
        int sub2 = obj.nextInt();
        int sub3 = obj.nextInt();
        int sub4 = obj.nextInt();
        int sub5 = obj.nextInt();

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = totalMarks / 5.0;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println(totalMarks);
        System.out.println(average);
        System.out.println(percentage + "%");

    }
}
