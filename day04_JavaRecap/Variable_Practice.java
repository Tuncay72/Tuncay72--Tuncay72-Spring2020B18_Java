package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {
        byte num1  = 127;
        short num2 = num1; //double>float>long>int>short>byte

        //byte num3 = num2;

        int num4 = num2; // int is prefered by compiler

        long num5 = 999999999999999L;

        float num6 = 100L;
        System.out.println(num6); //100.0

        float num7 = 0.5f;
        System.out.println(num7); //0.5

        double num8 = 0.5f;
        double num9 = 99999999L;
        double num10 = 100.5;
        System.out.println(num10); //100.5

        char ch1 = '$';
        System.out.println(ch1); //$

        char ch2 = '8';
        System.out.println(ch2); //8

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 =  'z' + '8';
        System.out.println(ch4);

        boolean x = ('z'+'8')==178;
        System.out.println(x);

        System.out.println('z' +5+'8'); //183

        int a1 = '8';
        System.out.println(a1);//56

        int a2 = 'z';
        System.out.println(a2); //122

        double d1 = 'z'+'8';
        System.out.println(d1); // 178.0

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(9>10);
        System.out.println(9>=9);
        System.out.println(9 != 10);
        System.out.println('a'=='b');
        //System.out.println('a'=="a"); " does not match
        System.out.println('a' == 'b'-1);

        System.out.println("Muhtar"=="Good Guy");
        System.out.println("Muhtar" != "Good Guy");
        System.out.println("Muhtar" == "muhtar");


        boolean r1 = !true;
        System.out.println(r1); //false
        System.out.println(!r1);//true
        System.out.println(!true == false);//true
        System.out.println(!true != !false);//true






    }
}
