package d;

public class Nested_Loop_Practice {
    // 1. print all even numbers ina same line

    // 2. count odd numbers ==> return the total odd number
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // Arrays.sort(numbers);
      //  System.out.print(numbers);
        int countOddNum = 0;
        for(int j = 0; j<numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                int num = numbers[j][i];
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                } else {
                    countOddNum++;
                }
            }
            }
            System.out.println();
            System.out.print(countOddNum);
        }
    }
