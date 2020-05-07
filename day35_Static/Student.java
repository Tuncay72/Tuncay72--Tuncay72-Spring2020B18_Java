package day35_Static;

public class Student {

    String name;
    long ID ;
    double gpa;
    static String school ="Cybertek";


    public  void setInfo(String name, long ID, double gpa){
        this.name =name;
        this.ID = ID;
        this.gpa =gpa;
    }


    public static void printSchoolNmae(){
        System.out.println("School name is: "+ school);
    }


    public String toString(){
        return "Name: "+ name+ ", School Nmae: "+school;
    }
}
