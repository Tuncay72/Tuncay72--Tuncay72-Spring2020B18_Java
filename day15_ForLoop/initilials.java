package day15_ForLoop;

import java.util.Scanner;

/*
1. write a program that asks user's first and last name, then prints out the initials of the user
        Ex:  cybertek
        input:  batch12
                            output:your initial is: CB
*/
public class initilials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = scan.next();

        System.out.println("Enter your last name");
        String lastname =  scan.next();

        //String initials = firstname.substring(0,1).toUpperCase()+lastname.substring(0,1).toUpperCase();
        //initials = initials.toUpperCase();

        String initials =""+ firstname.charAt(0)+lastname.charAt(0);
                initials = initials.toUpperCase();


        System.out.println(initials);




    }

}
