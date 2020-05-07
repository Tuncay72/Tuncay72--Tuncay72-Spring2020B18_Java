package day34_CustomClass;

public class Students {
    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;

    public void setStudentsInfo(String name, String nationality, int age, double gpa, char gender, boolean married){
        this .name = name;
        this.nationality=  nationality;
        this.age= age;
        this.gpa = gpa;
        this.gender = gender;
        this.married = married;
    }


    public String toString(){

    return "Name is: "+name+", gender: " + gender+ ", nationality: "+nationality+ ", age: "+age+ ", married: "+married;
}
}