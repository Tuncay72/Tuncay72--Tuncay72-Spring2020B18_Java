package day18_NestedLoop;

public class do_while_Practice1 {
    public static void main(String[] args) {
        int num =0;
        do{
            if (num%2==0) {
               System.out.print(num + " ");
            }
                num++;
            }while(num<=100);

        System.out.print(num);
        System.out.println("================================");

        int i =1;
        do{

            System.out.println(i);   // output:(1, 2, 3, 4, 5)
            i++;
        }while(i<=5);

        System.out.println("=============================");

        int z =1;
        do{


            System.out.println(z);

            if(z==3){
              z++;
                break;
            }


            z++;
        }while(z<=5);

        System.out.println("=========================================");

        int y =0;
        do{

            if(y%3==0 && y%2==0) {

                y++;
                continue;

            }

            System.out.println(y);

            y++;
        }while(y<=20);


        }
    }

