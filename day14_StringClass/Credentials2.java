package day14_StringClass;
/*
      valid credentials are:
            username: cybertek
            password: cybertekschool

            precondition:  username and password connot be empty
                           if they are empty ==> please enter the credentials
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
 */

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name");
        String inputusername = input.next();

        System.out.println("Enter tour password");
        String inputpassword = input.next();

        boolean LogedIn = inputusername.equals("Cybertek") && inputpassword.equals("cybertekschool");

        boolean invalidusername = !inputusername.equals("Cybertek") && inputpassword.equals("cybertekschool");

        boolean invalidpassword = inputusername.equals("Cybertek") && !inputpassword.equals("cybertekschool");

        if( !inputusername.isEmpty() && !inputpassword.isEmpty()){
            if(LogedIn){
                System.out.println("Logged In");
            }else if(invalidusername){
                System.out.println("Invalid user name , valid password");
            }else if(invalidpassword){
                System.out.println("Valid user name, invalid password");
            }else {
                System.out.println("Invalid user name and invalid password");
            }



        }else{
            System.out.println("Please enter the credential");

        }


    }
}
