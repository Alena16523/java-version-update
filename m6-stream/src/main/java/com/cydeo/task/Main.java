package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //print how many characters in each element
        List<String> words= Arrays.asList("Java", "Apple", "Honda", "Developer");

        words.stream()
                .map(p->p.length())
                .forEach(System.out::println);

    }
}
