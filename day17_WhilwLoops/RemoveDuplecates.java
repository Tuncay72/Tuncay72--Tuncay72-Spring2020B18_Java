package day17_WhilwLoops;

public class RemoveDuplecates {

    public static void main(String[] args) {

        String str = "Java is fun, Java is cool";

        int count = 0;
        // String word = "java".toUpperCase();

        while(str.contains("Java")) {
            count++;
            str = str.replaceFirst("Java", "");

            //count++;
        }
        System.out.println(count);
    }
}
