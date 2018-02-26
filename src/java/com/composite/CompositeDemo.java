/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.composite;

/**
 *
 * @author Kolade
 */
public class CompositeDemo {
    public static void main(String[] args) {
        
    
    Employee CEO = new Employee("Arowolo Ibrahim", "MD", 4000000);
    Employee headMarketing = new Employee("Christopher Kingsley", "Marketing and Corporate Comm.", 3000000);
    Employee headSecurity = new Employee("Chigozie Madu", "Security", 3000000);
    Employee marketer1 = new Employee("Chinyere Victoria", "Marketing and Corporate Comm.", 1000000);
    Employee marketer2 = new Employee("Femi Akin", "Marketing and Corporate Comm.", 1000000);
    Employee security1 = new Employee("Wale Hassan", "Security", 1000000);
    Employee security2 = new Employee("Buhari Aliyu", "Security", 1000000);
    
    CEO.add(headMarketing);
    CEO.add(headSecurity);
    headMarketing.add(marketer1);
    headMarketing.add(marketer2);
    headSecurity.add(security1);
    headSecurity.add(security2);
    
       // System.out.println(CEO);
        
        for (Employee head : CEO.getSubordinates()){
            System.out.println(head);
            for(Employee subordin : head.getSubordinates()){
                System.out.println(subordin);
            }
        }
    
    }
}
