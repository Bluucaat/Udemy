package dev.lpa;

import dev.lpa.domain.Employee;
//import dev.lpa.domain.EmployeeComparator;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Cinthia", 2011),
                new Employee(10022, "James", 2005),
                new Employee(13123, "Ronald", 2017),
                new Employee(10054, "Carole", 2019)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

//        employees.sort(new Employee.EmployeeComparator<>());
        employees.sort(new Employee.EmployeeComparator<>("yearStarted")
                .reversed());

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
