package day30_ArrayList;

import java.util.ArrayList;
public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>();

                list.add("A");
                list.add("B");
                list.add("c");

         //list.remove(1);

        //String str = "B";
             //list.remove(str); //[A,C]
        boolean r1 = list.remove("F"); //true



        System.out.println(list);
        System.out.println(r1);

        ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            list2.add(2);
            list2.add(3);

            int num1 = list2.indexOf(1); //0
               //Integer = int //autoboxing
        System.out.println(num1); // 0

        int num2 = list2.indexOf(100);
        System.out.println(num2); // -1

        int num3 = list2.indexOf(3);
        System.out.println(num3); //3



    }
}
