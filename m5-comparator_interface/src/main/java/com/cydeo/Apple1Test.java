package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Apple1Test {
        public static void main(String[] args) {

            List<Apple1> inventory = new ArrayList<>();
            inventory.add(new Apple1(300,Color.GREEN));
            inventory.add(new Apple1(100,Color.RED));
            inventory.add(new Apple1(200,Color.GREEN));
            inventory.add(new Apple1(50,Color.RED));


            //imported static
            inventory.sort(comparing(Apple1::getWeight));
            System.out.println(inventory);

            //Chaining
            inventory
                    .sort(comparing(Apple1::getWeight)
                            .reversed().thenComparing(Apple1::getColor));






        }
}
