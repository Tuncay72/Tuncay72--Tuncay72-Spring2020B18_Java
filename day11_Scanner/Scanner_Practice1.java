package day11_Scanner;

/*

Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employed or not? true ==> employed, false ==> unemployed
    4. if he is employed , ask the salary
    4. if he is not employed set the salary to 0
    output:
        full name:
        employed status:
        salary:
   */

import java.util.Scanner;

public class Scanner_Practice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName + " " + lastName;

        System.out.println("Are you employed?");
        boolean employementStatus = input.nextBoolean();

        double salary = 0;

        if (employementStatus == true) {
            System.out.println("Enter your salary: ");
            salary = input.nextDouble();
        }


        System.out.println("Full name is: " + fullName);
        System.out.println("Employed: " + employementStatus);
        System.out.println("Salary: $" + salary);


    }
    }