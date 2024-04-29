package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

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

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2020, "Target")
        ));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }
    }
}
