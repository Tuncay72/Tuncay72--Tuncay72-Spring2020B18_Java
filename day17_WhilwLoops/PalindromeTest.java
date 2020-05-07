package day17_WhilwLoops;

public class PalindromeTest {
    public static void main(String[] args) {

        String str = "kabaK";
        String reversedStr = ""; // store the reversed version of str

        int index= str.length()-1;  //last index number

        while(index >= 0){
            reversedStr += str.charAt(index);
            index--;
        }
        boolean palindrome = reversedStr.equalsIgnoreCase(str);
       // boolean palindrome = str.equalsIgnoreCase(reversedStr); //Can we use like this?


        System.out.println(palindrome);




    }
}
