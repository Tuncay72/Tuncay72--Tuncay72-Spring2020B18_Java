package day17_WhilwLoops;

import java.util.Scanner;

public class whileLoop_Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        for(int i = ; i<101; i++){
            System.out.print("*");
        }
     */
      int i =1;
      while(i<101){

          System.out.print("*");
          i++;
      }
        System.out.println();

      /*
      ***
      * *
      * *
      * *
      ***
       */

        System.out.println("********");
        int number =4;
      while(number >0){
          System.out.println("*      *");
          number++;
      }
        System.out.println("********");


    }



























}
