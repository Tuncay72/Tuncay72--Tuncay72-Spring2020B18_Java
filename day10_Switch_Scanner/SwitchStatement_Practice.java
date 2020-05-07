package day10_Switch_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {

        int number =5;

        String result = " ";
/*
        switch( number){


            case 1:
                System.out.println("Monday");
                break; //case closed

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid");
                break;

        }

             */
        switch( number){

            case 1:
                result="Monday";
                break; //case closed

            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
               result = "Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default :
                result="Invalid";
                break;

        }
        System.out.println(result);
    }
}
