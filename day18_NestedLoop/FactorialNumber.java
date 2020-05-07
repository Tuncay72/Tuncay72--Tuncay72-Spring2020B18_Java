package day18_NestedLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int result = 1;

        while(num>=1){

             result *=num;
            num--;
        }

        System.out.println(result);
    }
}
