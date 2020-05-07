package day18_NestedLoop;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */

        int kingbed = 120;
        int queenbed = 100;
        int singlebed = 80;


        while(true){
            System.out.println("Eneter the room");
            String kingBed = input.next();
            String queenBed = input.next();
            String singleBed = input.next();

            System.out.println(kingBed);
            System.out.println("Do you wanna continue");
            String answer = input.next();
        }
    }
}