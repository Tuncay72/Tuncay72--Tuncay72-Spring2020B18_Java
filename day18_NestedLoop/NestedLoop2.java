package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {
  /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
   */

        System.out.println();


        for (int a = 9; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {


                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("============================================");

        for(char z='z'; z>='a'; z--){
            for(char ch = 'a'; ch<=z; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}