package day07_IfStatements;
/*
2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */

public class MaxNumber {
    public static void main(String[] args) {

        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a > b && a > c;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;

        if(aGreater) {
            System.out.println(a + " is greater number");
        }
        if(bGreater){
            System.out.println(b+ " is greater number");
        }
        if(cGreater){
            System.out.println(c +" is greater number");
        }



    }


}
