package com;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/**
 * Created by S.H.I.E.L.D on 2017/4/12 0012.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee: [ Name:" + name +
                ",depte:" + dept +
                ",salary :" + salary + "]");
    }
}
