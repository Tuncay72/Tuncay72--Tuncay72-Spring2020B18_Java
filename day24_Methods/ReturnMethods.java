package day24_Methods;

public class ReturnMethods {
    public static void maxNum(int a, int b, int c) {

        if (a >= b && a >= c) {
            System.out.println(a);

        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


    }

    public static void main(String[] args) {
        maxNum(10, 30, 40);

      // int  a = maxNum(10, 20, 40);

        int result = Addition(1000, 2000);
         // Addition(100,250);
        System.out.println(result); // 3000

        int result2 = result + 2000;   // 5000

        System.out.println(result2); // 5000
    }


    public static int Addition(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}