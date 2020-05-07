package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */


        int z = 1;
        while (z >= 7) {

            int i = 1;
            while (i <= z) {
                System.out.print("* ");
                i++;
            }

            System.out.println();
            z++;
        }


        System.out.println("============================");


        int z1 = 7;
        while (z1 >= 1) {

            int x = 1;
            while (x<=z1) {
                System.out.print("* ");
                x++;
            }

            System.out.println();
            z1--;
        }
        System.out.println();
    }
    }




