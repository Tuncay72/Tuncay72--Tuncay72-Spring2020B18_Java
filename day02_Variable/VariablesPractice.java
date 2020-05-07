package day02_Variable;

import java.util.Arrays;

import static java.lang.System.*;

public class VariablesPractice {
    public static void main(String[] args) {
      /*
      salary,tax rate,loan,ssn
       */

         int salary = 120000;
         double federalTax = 0.18;
        float stateTax = 0.065f;

            //salary after tax = salary(1-sum of taxes)
        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1-sumTaxes);
        System.out.println(salaryAfterTax); // salary after tax
        System.out.println("Salary After Tax: "+salaryAfterTax);

        System.out.println("=========================");
        //area of the circle = r*r*pi
        double r = 5.5;
        double area = r*r*3.14;
     System.out.println(area);

     System.out.println("=============================");
     int kg = 90;
     double pound = kg*2.25;
     System.out.println(pound);

     System.out.println("===========================");
      double lira = 1000;
      double liraInDollar = lira / 6.5;
      System.out.println(liraInDollar);

      double rupi = 1000000;
      double rupiInDollar = rupi*0.014;
      System.out.println("Rupi In Dolar: "+"$" +rupiInDollar);

      double liter = 100;
      double galons = liter/3.7;
      double galonPrice = 2.75;
      double TotalPrice = galons*galonPrice;
        System.out.println("Total Price: "+"$" +TotalPrice);


        // salary = ( salalry*( stateTax +federal ));

       // double salaryAfterTax = salary * ( 1- sumTax) ;

       // System.out.println(salaryAfterTax);
    }

}
