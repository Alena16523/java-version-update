package com.cydeo.task;

import java.util.Comparator;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .forEach(System.out::println);


        //print the length of the name of each dish

        DishData.getAll().stream()
                .map(p->p.getName().length())
                .forEach(System.out::println);


        //print 3 high calorie dish name (>300)

        DishData.getAll().stream()
                .filter(p->p.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(n->n.getName())
                .forEach(System.out::println);



    }
}
