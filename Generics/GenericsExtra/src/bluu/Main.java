package bluu;

import bluu.model.BluuStudent;
import bluu.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;

        //eventhough we can add students of any type to the container
        //we can't pass a list type thats BluuStudent to a reference variable
        //of list type with student.
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        printList(students);

        List<BluuStudent> bluuStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            bluuStudents.add(new BluuStudent());
        }

        //student type list takes BluuStudent.
        students.add(new BluuStudent());


        printList(bluuStudents);
    }
    
    public static void printList(List students){
        for(var student : students){
            System.out.println(student);
        }
        System.out.println();
    }
}
