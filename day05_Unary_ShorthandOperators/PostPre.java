package day05_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {
        //pre: changes the value of the variable immediately

        int a= 100;
        System.out.println(++a); //101
        System.out.println(a); //101

        int b = 100;
        System.out.println(--b); //99
        System.out.println(b); //99

        // post: first passes the current value, then eventually changes  the variable' value

        int A = 100;
        System.out.println(A++); // at line 19 , A' values is still 100
        System.out.println(A); //101

        int B = 100;
        System.out.println(B--);   //100
        System.out.println(B);// 99

        // post & pre examples:

        int z = 10;
        int X = ++z; // at line 29 , x is increased by 1

        System.out.println(X); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s++;  // 10, after line 35 , the value of s will be increased by 1

        System.out.println(f); //10
        System.out.println(s); //11

        double t1 = 3.5;
        double t2 = t1--; // 3.5 , after line 42 t1 will be decreased by 1

        System.out.println(t2); // 3.5
        System.out.println(t1); // 2.5

        int num = 35;
        System.out.println(num++); // 35, after line 47 the value of will be 36
        System.out.println(num--); // 36 , after line 48 of the will be 35


    }
}