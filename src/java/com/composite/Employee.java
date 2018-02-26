/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kolade
 */
public class Employee {
    String name;
    String dept;
    double salary;
    List<Employee> subordinates = new ArrayList<>();
    
    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }
    public void add(Employee e){
        subordinates.add(e);
    }
    public void remove (Employee e){
        subordinates.remove(e);
    }
    
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates + '}';
    }
}
