package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike","mike@cydeo.com", Arrays.asList("2083647635", "4562846354") ),
                new Employee(101, "Ozzy","ozzy@cydeo.com", Arrays.asList("20834756635", "3762846354") ),
                new Employee(102, "Peter","peter@cydeo.com", Arrays.asList("3083647635", "4562846904") )
        );
    }

}
