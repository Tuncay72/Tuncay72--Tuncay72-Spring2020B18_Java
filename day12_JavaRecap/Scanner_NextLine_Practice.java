package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 7925 JonesBranch Dr, McLean VA, 22034B

        // fullAddress: Building-number  Street, city, state zipcode



        System.out.println("Builder Number: "); // 1.

        String Bnumber =  input.nextLine();


        //input.nextLine(); // used for taking out the Enter from scanner


        System.out.println("Street: ");
        String street = input.nextLine();


        System.out.println("Enter the zip code: "); // 3.
        String zipCode = input.nextLine(); // 22034

       // input.nextLine();



        System.out.println("enter the city name and state seperated by comma and space"); // 4.

        String cityState = input.nextLine(); // Eger +Line i eklemesek sadece ilk kelime basilir



        String fulladdress = Bnumber+" "+street+", \n"+cityState+" "+zipCode;



        System.out.println("Address is :" +fulladdress);



        //  input.close();   // closes the scanner


/*
        System.out.println("Builder Number: "); // 1.
        System.out.println("Street: ");  // 2.
        System.out.println("Enter the zip code: "); // 3.
        System.out.println("enter the city name and state seperated by comma and space"); // 4.

        String Bnumber =  input.nextLine();
        String street = input.nextLine();
        int zipCode = input.nextInt(); // 22034
        input.nextLine();


        String cityState = input.nextLine();

        String fulladdress = Bnumber+" "+street+", \n"+cityState+" "+zipCode;



        System.out.println("Address is :" +fulladdress);


*/



    }
}
