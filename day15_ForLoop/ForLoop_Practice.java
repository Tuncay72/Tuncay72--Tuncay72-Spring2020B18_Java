package day15_ForLoop;

public class ForLoop_Practice {
    /*
    Odd number between 0~100 in a single line seperated by a space 1 3 5 7 ...
     */

    public static void main(String[] args) {

/*
       // String resultodd = "";

        for(int number = 1; number <=100 ;number +=2) {
          System.out.print(number+" ");
          // resultodd = resultodd + number + " ";
        }
          //  System.out.println(resultodd);

    }

*/

    /*
    even number
     */

        String resulteven = " ";
        for (int i = 0; i <= 100; i += 2) {


          //System.out.print(i+" ");
            resulteven = resulteven +i+ " ";


        }
        System.out.println(resulteven);
    }
}







