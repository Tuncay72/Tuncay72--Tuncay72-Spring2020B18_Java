package day13_StringClass;
/*
		2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */

import com.sun.org.apache.xml.internal.utils.XMLString;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        System.out.println("Enter your building number: ");
        String Bnumber = input.next();

        input.nextLine();

        System.out.println("Enter the street: ");
        String street = input.nextLine();

        System.out.println("Enter the city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Ship to: "+fullName +"\n\t\t "+ Bnumber +" "+ street+"\n\t\t "+cityName+", "+zipCode);

*/
/*
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
*/
        System.out.println("Sender:");
        String sender = scan.nextLine();
        sender = "Mike Smith";

        System.out.println("Phone Number: ");
        String phoneNumber = scan.nextLine();
        phoneNumber="202-123-3456";


        System.out.println("Message body: ");
        String messageBody = scan.nextLine();
        messageBody="I love programing and problem solving";


        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);

    }

}
