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
        printMoreLists(students);
//        printList(students);

        List<BluuStudent> bluuStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            bluuStudents.add(new BluuStudent());
        }

//      student type list takes BluuStudent.
        students.add(new BluuStudent());
        printMoreLists(bluuStudents);
//      printList(bluuStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

    }


    //wildcard
    public static void printMoreLists(List<? extends Student> students){

//        unable to do the following, because this method won't know
//        the type of the element its trying to access.
//        Student last = students.get(students.size()-1);
//        students.set(0, last);

        for(var student : students){
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list){

        for(var element: list){
            if(element instanceof String s){
                System.out.println("String " + s.toUpperCase());
            }
            else if(element instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }
        }

    }
}
//    public static void testList(List<String> list){
//
//        for(var element: list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    //issues when overloading
//    public static void testList(List<Integer> list){
//        for(var element: list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }
//}



//upper bound
//    public static <T extends Student> void printList(List<T> students){
//        for(var student : students){
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
//}
