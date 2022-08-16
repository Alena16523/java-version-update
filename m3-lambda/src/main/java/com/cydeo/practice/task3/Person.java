package com.cydeo.practice.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Person {

    private String name;
    private int age;
    private Gender gender;


}
