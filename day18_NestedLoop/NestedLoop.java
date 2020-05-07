package day18_NestedLoop;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j= 0; j < 10; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i);
}
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("===================================");

        /*
        ******
        ******
        ******
        ******
        ******
        ******
        ******
         */

        for(int i =1; i<=6; i++){
            int a =1;
            while(a<=7){
                System.out.print("* ");
                a++;
            }
            System.out.println();
        }




    }
}