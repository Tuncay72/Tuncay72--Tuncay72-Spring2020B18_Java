package day03_VariablesContinue;

public class SalaryCalculator {


    public static void main(String[] args) {
       //DataType varaibleName  = Data;
       double hourlyRate = 55;
       double stateTaxRate = 0.04;
       double federalTaxRate = 0.22;
       byte weeklyHours = 40;
       byte totalWeeks = 52;


       // salary = hourlyRate*weeklyHours*totalWeeks
         double salary = hourlyRate*weeklyHours*52;
                          // salary before tax

        // stateTax = salary*stateTaxRate
        double stateTax = salary*stateTaxRate;
         // federalTax = salary*federalTaxRate
        double federalTax = salary*federalTaxRate;

        //totalTax = stateTax + federalTax
        double totalTax = stateTax + federalTax;

        // salaryAfterTax = salary - stateTax - federalTax

        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your Salary is: $"+ salary); // concatenation
        System.out.println("State Tax is: $" + stateTax); // concatenation
        System.out.println("Federal Tax is:$"+federalTax); // concatenation
        //System.out.println("Total tTx is: $" + (federalTax + stateTax));
        System.out.println("Total tTx is: $" + totalTax);
        System.out.println("Salary After Tax is $" + salaryAfterTax);

        /*
        System.out.println("9" +3); // 93,  concatenation
        System.out.println(9+"3"); //93, concatenation
        System.out.println(9+3); //93, addition
     */






    }
}
