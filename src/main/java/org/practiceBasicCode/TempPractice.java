package org.practiceBasicCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static org.recursion.StringRecursion.reverseString;


// Given an Employee class with Id, Name, Salary, and Department.
//Count Employees in Each Department Using Stream API.

public class TempPractice {
    public static void main(String[] args) {

        Employee emp=new Employee(1,"Deep",2000000,"Mapth");

        List<Employee> list=new LinkedList<>();
        list.add(emp);
        list.add(new Employee(2,"Dee",2000000,"Sc"));
list.add(new Employee(3,"De",2000000,"Com"));
list.add(new Employee(4,"Deep",2000000,"Mapth"));

Map<String,Long> map=list.stream().collect(Collectors.groupingBy(a -> a.getDepartment(),Collectors.counting()));

        System.out.println(map);

    }

}


class Employee {
    int id;
    String name;
    int salary;
    String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}