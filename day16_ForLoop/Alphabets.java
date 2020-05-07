package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {

        String upperCase = "";
        String  lowerCase = "";

        for(char ch='A'; ch<='Z'; ch++ ){
            upperCase +=ch;
        }
        System.out.println(upperCase);

        for(char ch1='a'; ch1<='z'; ch1++ ){
            lowerCase += ch1;
        }
        String result = "";
        for(int i = 0; i<=upperCase.length()-1; i++){
            result += upperCase.charAt(i) +""+ lowerCase.charAt(i)+" ";
        }
        System.out.println(result);


        System.out.println('a'+""+'b');
        int a = 97;
        int A = 65;
        String result2 = "";
        for(int i =0; i<26; i++) {
            char ch = (char) (A + i); // upper Case character
            char ch1 = (char) (a + i); // lower case character

            result2 += ch + "" + ch1 + " ";
        }
        System.out.println(result2);


    }
}
