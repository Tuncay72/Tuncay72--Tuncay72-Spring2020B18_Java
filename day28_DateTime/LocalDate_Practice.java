package day28_DateTime;
import java.time.LocalDate;
public class LocalDate_Practice {
      /*

    Warmup task:

    1. create an array of string, store five of your friends names in it

    2. create Array of localdates and store thier birthdays in the same order

    3. use for loop to print out your friends' names and thier birthdays



     */

    public static void main(String[] args) {

        String[] friends = {"john", "Aeron", "Daniel"};
        //    0        1        2

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AeronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday = LocalDate.of(2010, 5, 6);


        LocalDate[] Birthdays = {JohnBirthday, AeronBirthday, DanielBirthday};
        //     0              1              2
        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            LocalDate bd = Birthdays[i];
            System.out.println(name + "'s birthdays is " + bd);

        }

             /*
        int a = 100;
        int b = 200;
        int c = 300;

        int[] array1 = {a, b, c};
         */
    }
}