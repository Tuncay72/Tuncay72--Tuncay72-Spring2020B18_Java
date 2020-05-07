package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the full name: ");
        String fullName = input.next(); //accepts the "Enter"

        System.out.println("Your full name is: "+fullName);
        String sentence = input.nextLine();

        System.out.println("You entered: "+sentence);





    }


}
