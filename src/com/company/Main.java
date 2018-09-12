package com.company;

import com.company.ent.Employee;
import com.company.enumer.Position;

public class Main {

    public static void main(String[] args) {
        Employee empl1 = new Employee("Petya", 20,55.5, Position.DIRECTOR );
        Employee empl2 = new Employee("Vasya",22,45.5,Position.ENGINEER );
        Employee empl3 = new Employee("David", 25,40.5, Position.MANAGER);
        Employee empl4 = new Employee("Marina", 20, 40.0, Position.SECRETARY);
        System.out.println(empl1);
        System.out.println(empl2);
        System.out.println(empl3);
        System.out.println(empl4);
        System.out.println("Hours: " + Employee.getHours());
        System.out.println("Salary: " + Employee.getSalary());
    }
}
