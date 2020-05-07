package day10_Switch_Scanner;
import java.util.Scanner;
public class ScannerClass_RateCalculater {

    /*
    write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your salary: ");
             int salary = scan.nextInt();
        System.out.println("How many hours do you work in a week: ");
              byte weeklyHours = scan.nextByte();
        System.out.println("How many week do you have in a year: ");
              byte numberOfWeeks = scan.nextByte();
        int hourlyRate = ( salary / numberOfWeeks ) / weeklyHours;
        System.out.println("Hourly rate is: $" +hourlyRate);



    }
}
