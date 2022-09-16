/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2500)); //will have to change these two line
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 20.90, 40));


        //todo create at least 1 HourlyEmployee and 1 SalariedEmployee passing to the addEmployee method. page 110
        dept.addEmployee(new SalariedEmployee("Elihu", LocalDate.of(2022, 8, 29), 4000));
        dept.addEmployee(new HourlyEmployee("Jurgen", LocalDate.of(2020, 1, 10), 27.50, 40));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Pay its employees
        System.out.println("\nPay employees:");
        dept.payEmployees();
    }

}