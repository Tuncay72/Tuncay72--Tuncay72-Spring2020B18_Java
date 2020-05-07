package day13_StringClass;

public class StringManipulation3 {

    public static void main(String[] args) {

        String str = "I like Java prog John";
            int num1 =str.indexOf("John");

        System.out.println(num1);//

        String str2 ="Cybertek school is awesome";
                    int num2=str2.indexOf("school");
                    int num3 = str2.indexOf("school")+4;
        System.out.println(num2);
        System.out.println(num3);


        String names = "Muhtar";

        int a1 = names.indexOf("Good Guy");

        System.out.println(a1);


        String fullname = "Rahman Abdalla";

        String firstName = fullname.substring(0,  fullname.indexOf(" ")  );

        String lastName = fullname.substring( fullname.indexOf(" ")+1);

        System.out.println(firstName);

        System.out.println(lastName);

    }


}
