package day12_JavaRecap;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        char ch1 = 'K';
        String result = (ch1=='A')? "A is selected" : (ch1 == 'B')?"B is selected" : (ch1 == 'C')?"C is selected"
                :(ch1 == 'D')?"D is selected" : (ch1 == 'E')?"E is selcted" : "Invalid Entry";

        System.out.println(result);

    }
}
