package day10_Switch_Scanner;
import java.util.Scanner;
public class number_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
            int num1 = scan.nextInt();
        System.out.println("Enter your second numer: ");
            int num2 = scan.nextInt();
        System.out.println("Enter your third number: ");
            int num3 = scan.nextInt();

          //  int Max = (num1 >= num2 && num1 >= num3)? num1 : (num2>=num1 && num2>=num3)? num2 :num3;
           // int Min = (num1 < num2 && num1 <num3)? num1 : (num2<num1 && num2<num3)? num2 :num3;
            int Mid = (num1 > num2 && num1 <num3)? num1 : (num2>num1 && num2<num3)? num2 :num3;

        //System.out.println("Maximum number is: " +Max);
        //System.out.println("Minimum number is: "+Min);
        System.out.println("Middle number is: "+Mid);
    }
}
