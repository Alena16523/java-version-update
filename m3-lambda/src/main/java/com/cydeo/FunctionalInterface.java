package com.cydeo;

import com.cydeo.task.Apple;
import com.cydeo.task.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap=new ApplePredicate() { //AppleHeavyPredicate class-anonymous class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("--------------------------------");


        //Predicate interface

        Predicate<Integer> lesserThan= i-> i<18; //true false
        System.out.println(lesserThan.test(20));

        //Consumer

        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(10);

        //BiConsumer

        BiConsumer<Integer, Integer> addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(2,3);

        //Function

        Function<String, String> fun=s->"Hello "+s;
        System.out.println(fun.apply("Cydeo"));

        //BiFunction

        BiFunction<Integer, Integer, Integer> func=(x1,x2)->x1+x2;
        System.out.println(func.apply(2,3));

        //Supplier

        Supplier<Double> randomValue=()-> Math.random();
        System.out.println(randomValue.get());


    }
}
