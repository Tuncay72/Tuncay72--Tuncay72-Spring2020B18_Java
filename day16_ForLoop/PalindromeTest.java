package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.next();
           String reversedWord = "";

           for(int i = word.length()-1; i>=0; i--){
              reversedWord += word.charAt(i);

        }
           boolean palindrome = reversedWord.equals(word);
          // boolean palindrome = word.equalsIgnoreCase(reversedWord); //Level

        System.out.println(palindrome);
    }
}
