import java.util.Scanner;
public class SimpleInterest {
    public static void main(String [] arg){
        Scanner obj  = new Scanner(System.in);
         int P =  obj.nextInt();
         int R  =  obj.nextInt();
         int T = obj.nextInt();

         long SimpleInterest =  (P*T*R)/100;
         System.out.println(SimpleInterest);

    }
}
