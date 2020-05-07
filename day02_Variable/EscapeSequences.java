package day02_Variable;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\tHello");
                // \t means a paragraph space
        System.out.println("Cybertek School");
        System.out.println("Cybertek \nScholl");
        System.out.println("My\nName\nIs\nTuncay");
        System.out.println("\nMy \nName \nIs \nTuncay");
             //\n means new line, starts with new line
        //print: My favorite TV show is " game of Thrones"
        System.out.println("My favorite TV show is \"Game of Thrones\"");
               // \" means double code on the console
        System.out.println("\\");
                // \\ means print \ on the console
        System.out.println("/");
                // / means print / on the console
        System.out.println("My \\ favorite book is \' java \'");
        System.out.println("My favorite book is ' JAva ' " );
            // \' and '  means print on the console '    '


    }
}
