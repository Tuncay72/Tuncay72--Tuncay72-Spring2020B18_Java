package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {10, 20, 30};

        System.out.println( arr.length ); // 3

        int[] arr2= new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        String[] Testers = new String[5];  // {"Reem", "Madina", "Osman"};
        // index: 0, 1, 2

        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Madina";
        System.out.println(Testers[0]);  // Reem
        System.out.println(Testers[1]); // Madina
        System.out.println(Testers[2]); // Osman
        System.out.println(Testers[3]);//null
        System.out.println(Testers[4]);//null

        System.out.println(Testers.length);  // 5

        System.out.println("========================================");


        // write a program that asks "enter a name" 10 times, and store each of the names in the array students
/*
       // int[] arr3 = { "Ali", "Veli", "Deli", "Alex", "Tony", "Mustafa", "Mahmut", "Mesut", "Cevat", "Cevdet" };

*/
        String[] students = new String[10];
System.out.println("Enter a name 10 times");

        students[0]= scan.nextLine();
        students[1]= scan.nextLine();
        students[2]= scan.nextLine();
        students[3]= scan.nextLine();
        students[4]= scan.nextLine();
        students[5]= scan.nextLine();
        students[6]= scan.nextLine();
        students[7]= scan.nextLine();
        students[8]= scan.nextLine();
        students[9]= scan.nextLine();
        for(int i =0; i<=9;i++){
            System.out.print(students[i] +", ");
        }

    }
}
