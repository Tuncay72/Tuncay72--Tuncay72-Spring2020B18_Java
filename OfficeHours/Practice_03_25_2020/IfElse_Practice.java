package OfficeHours.Practice_03_25_2020;

public class IfElse_Practice {
    public static void main(String[] args) {
        int num = 100;
     /*
        if(num%2 != 0){
            System.out.println(num+" is odd number");
        }
        if(num%2==0){
            System.out.println(num+" is even number");
        }

      */

     if(num%2!=0){
         System.out.println(num+" is odd number");
     }else{
         System.out.println(num+" is even number");
     }

     int age = 21;

     if(age>=21){
         System.out.println("you are eligible to buy alchol");
     }else{
         System.out.println("You are not eligible to buy alchol");
     }

     boolean usCitizen = true;
     int ageOfPerson = 30;
     if(usCitizen&& ageOfPerson>=30){
         System.out.println("You are eligible to vote");
     }else{
         System.out.println("You are not eligible to vote");
     }




    }
}
