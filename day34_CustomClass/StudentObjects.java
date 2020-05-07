package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Students student1 = new Students();
         student1.setStudentsInfo("Adam", "England", 34, 3.5, 'M', true);

        Students student2 = new Students();
         student2.setStudentsInfo("Mike", "German",30,3, 'M', false);

        Students student3 = new Students();
        student2.setStudentsInfo("Johnny Guitar", "US", 40, 2.5, 'M', false);

        Students student4 = new Students();
        student2.setStudentsInfo("Anna", "Ukranian", 33, 3.9, 'F', true);


        Students[] students = {student1, student2, student3, student4};


        ArrayList<Students> canGraduate = new ArrayList<>( Arrays.asList(students) );

        canGraduate.removeIf( p -> p.gpa <= 3.0 );

        System.out.println(canGraduate.size());

        for( int i = 0; i < canGraduate.size(); i++){
            Students each = canGraduate.get(i);

            System.out.println( each.name +" can graduate");

        }

        System.out.println("=========================================================");

        ArrayList<Students> canNotGraduate = new ArrayList<>(  Arrays.asList(students) );
        canNotGraduate.removeIf( p -> p.gpa > 3.0);

        System.out.println(canNotGraduate.size());



        for( Students each : canNotGraduate){
            System.out.println(each.name+" can not graduate");

        }

    }

}

