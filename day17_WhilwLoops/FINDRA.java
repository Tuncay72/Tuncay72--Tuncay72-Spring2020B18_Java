package day17_WhilwLoops;
/*
3. write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead of the number.
        2. for numbers which are divisible by 5, print "RA" instead of the number
        3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
        Ex:
        1 2 FIN 4 RA FIND .... FINDRA

 */

import java.util.Scanner;

public class FINDRA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String result ="";

        for(int i =1; i<=30; i++){

            if(i%3==0&&i%5==0){
                //System.out.println("FINRA");
                result += "FINRA"+" ";
            }else if(i%3==0){
                //System.out.println("FIN");
                result += "FIN"+" ";
            }else if(i%5==0){
                //System.out.println("RA");
                result += "RA"+" ";
            }else{
               //System.out.print(i+" ");
                result += i+" ";
            }

        }
        System.out.println(result);

    }
}
