package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //print all emails

        EmployeeData.readAll()
                //.map(employee::employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("------------------------");

        //print all phone numbers

        EmployeeData.readAll()
                .flatMap(p->p.getEmpPhoneNUmber().stream())
                .forEach(System.out::println);

        System.out.println("------------------------");

        //print all phone numbers with double colon

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNUmber)
                .flatMap(List::stream)
                .forEach(System.out::println);










    }
}
