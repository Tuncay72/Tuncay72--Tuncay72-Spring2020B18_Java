package day07_IfStatements;
/*
 4. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */

public class MediumNumber {
    public static void main(String[] args) {

        /*
        double a = 100;
        double b = 200;
        double c = 300;

        /*
        a: if (aAb && a>c) or (a>b && a<c)
        b: if(b<c && b>a) or (b>c && b<a)
        c: if (c<b && c>a) or (c>b && c<a)
         */
        /*

        boolean aMedium = (a < b && a > c) || (a > b && a < c);
        //b<a<c or c<a<b

        boolean bMedium = (b < a && b > c) || (b > a && b < c);
        //c<b<a or a<b<c

        boolean cMedium = (c < b && c > a) || (c > b && c < a);
        // a<c<b or b<c<B

        if (aMedium) {
            System.out.println(a + " is the medium number");

        }
        if (bMedium) {

            System.out.println(b + " is the medium number");
        }
        if(cMedium){
            System.out.println(c +" is the medium number");
        }
        */


        int score =0;
        if(score ==0){
            score += 50;

        }
        if(score !=0){
            score +=50;
        }
        System.out.println(score);

       boolean A =true, B=!A;
       if(A) {
           if (B) {
               System.out.println("monday");

           } else {
               System.out.println("tuesday");
           }
       }else{
           if(A){
               System.out.println("thursday");
           }else{
               System.out.println("friday");
           }




        }
    }
}