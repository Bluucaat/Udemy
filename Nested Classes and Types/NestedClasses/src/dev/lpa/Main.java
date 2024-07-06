package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Collections;
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

        System.out.println("With pig latin names");
        addPigLatinName(storeEmployees);
    }

    public static void addPigLatinName(List<? extends StoreEmployee> list){

        String lastName = "Piggy";
        class DecoratedEmployee extends StoreEmployee
            implements Comparable<DecoratedEmployee> {

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for(var empoyee : list){
            String name = empoyee.getName();
            String pigLatin = name.substring(1)+name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, empoyee));
        }

        newList.sort(null);
        for(var dEmployee : newList){
            System.out.println(dEmployee.originalInstance.getName() + " "
            + dEmployee.pigLatinName);
        }
    }
}
