package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        //Intermediate Operations

        List<Integer> list= Arrays.asList(1,2,3,4);
        // list.forEach(x-> System.out.println(x));
       // list.forEach(System.out::println); //forEach can be used as terminal operation

        //FILTER
        System.out.println("Filter");
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        //DISTINCT -checking unique elements
        System.out.println("____________________");
        System.out.println("Distinct");

        Stream<Integer> str=list.stream()
                .filter(i->i%2==0)
                .distinct();
        str.forEach(System.out::println);

        //LIMIT
        System.out.println("____________________");
        System.out.println("Limit");
        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("____________________");
        System.out.println("Skip");
        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);

        //MAP
        System.out.println("____________________");
        System.out.println("MAP");
        list.stream()
                .map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");







    }
}
