package day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        int num1 = 300;
        int num2 = 200;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(min);

        System.out.println("================================================");
        int hour = 21;
        String result = (hour <= 12 && hour < 18) ? "Good Morning" : (hour > 12 && hour <= 18) ? "Good Afternon" : " Good Evening";
        System.out.println(result);

        System.out.println("================================================");
        int number = 12005;
        boolean divisibleBy3AndBy5 = (number % 3 == 0 && number % 5 == 0) ? true : false;
        System.out.println(divisibleBy3AndBy5);

    }

}
