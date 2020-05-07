package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yy");

        LocalDate birthday = LocalDate.of(1986, 10, 01);

        String str1 = birthday.format(dtf);
        LocalDate date  = LocalDate.now();

        System.out.println(str1);


    }
}
