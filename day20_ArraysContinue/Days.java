package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter a number");
        int num = input.nextInt();

        int attepmt = 1;

        while(num>7 || num<1) {
            System.out.println("Invalid entry, please re enter");
             num = input.nextInt();
             attepmt++;

            if (attepmt == 3 && (num > 7 || num < 1)) {
                System.out.println("Invalid entry , you have already have 3 attepmt  ");

                System.exit(0);
            }
        }

        String result = days[num-1];
        System.out.println(result);
    }
}
