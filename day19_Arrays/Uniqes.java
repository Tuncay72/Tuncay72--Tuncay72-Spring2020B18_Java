package day19_Arrays;
import java.util.Scanner;
public class Uniqes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String str = input.next();

        String result = ""; //"C", to store the unique characters

        for(int j=0; j <= str.length()-1; j++ ){

            char ch2 = str.charAt(j);

            int count = 0 ;  // to count the occurrence of the character

            for(int i = 0; i <= str.length()-1; i++){

                char ch = str.charAt(i);

                if(ch == ch2){  // check how many time the character is  occurred in the string

                    count++;

                }
            }

            if(count == 1){  // the the character at index J is unique , will be concated to the result

                result+=ch2;
            }
        }
        System.out.println(result);
    }
}
