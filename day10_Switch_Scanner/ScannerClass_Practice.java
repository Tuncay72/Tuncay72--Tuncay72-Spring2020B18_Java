package day10_Switch_Scanner;
import java.util.Scanner;
public class ScannerClass_Practice {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        System.out.println("Enter you first number: ");
               byte num1 = input.nextByte();
        System.out.println("Enter your second number: ");
               byte num2 = input.nextByte();
        //System.out.println("The sum of those two numbers are: " +(num1+num2));
               int total =num1+num2;
        //System.out.println("The sum of those two numbers are: "+total);

        System.out.println("The sum of "+num1 +" and " +num2+" is: "+total);

    }

}
