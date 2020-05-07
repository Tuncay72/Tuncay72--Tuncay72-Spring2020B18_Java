package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";
        int a1 = Integer.parseInt(str); //123
        System.out.println(str+1); // text // "123"+1="1231"

        System.out.println(a1+1); // number // 123+1 ==> 124

        byte b1 = Byte.parseByte(str); // byte = 123
        System.out.println(b1+5); // 123+5==> 128

        Integer I1 = (int)Byte.parseByte(str); // Autoboxing
        //Integer = (int)byte;
        //Integer = int;

        String str2 = "12.5";

        float f1 = Float.parseFloat(str2);
        System.out.println(f1+1); // 12.5+1==>13.5

        double f2 = Double.parseDouble(str2);
        System.out.println(f2+1); // 12.5+1==>13.5

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);
        System.out.println(num1+2); // 3147483647+2 ==> 3147483649

        Long num2 = Long.parseLong(str3);  // Autoboxing
        System.out.println(num2+2); //3147483647+2 ==> 3147483649

        String result1 = "TrUe"; //not "true" or not "false"  ==> false
        boolean r1 = Boolean.parseBoolean(result1); //true
        System.out.println(r1);

        String result2 = "FaLSe";
        boolean r2 =Boolean.parseBoolean(result2);
        System.out.println(r2);  // false






    }
}
