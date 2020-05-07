package day23_Methods;

public class E_Methods_WithParameters2 {
    public static void main(String[] args) {
        String str= "Tuncay";
        ReverseString(str);
    }

        public static void ReverseString(String str){
        for(int i = str.length()-1; i>=0; i--){

            //System.out.print(str.charAt(i));

            System.out.print(str.substring(i,i+1));
        }

}
}