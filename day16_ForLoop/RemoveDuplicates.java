package day16_ForLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str= "ababbacd";

        String result = ""; //ab

        for(int i=0; i<=7; i++){

          if(result.contains(""+str.charAt(i))) {
              continue;
          }

              result += str.charAt(i);
          }

        System.out.println(result); //ab

    }
}
