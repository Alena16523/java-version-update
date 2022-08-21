package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("ALL MATCH ");

        boolean isHealthy=DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("-----------------------");
        System.out.println("ANY MATCH");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("-----------------------");
        System.out.println("NONE MATCH");
        boolean isHealthy2= DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("-----------------------");
        System.out.println("FIND ANY"); //picks one option
        Optional<Dish> dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("-----------------------");
        System.out.println("FIND FIRST"); //grabs first option from flowting elements
        Optional<Dish> dish2=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        System.out.println("__________________________");

        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());
        System.out.println("__________________");

        List<String> list1= Arrays.asList("Johny", "David", "Jack", "Duke", "Jill", "Denny", "Julia", "Daniel");
        List<String> list2= Arrays.asList("Johny", "David", "Jack", "Duke", "Jill", "Denny", "Julia", "Daniel");

        Optional<String> findFirst=list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny=list1.parallelStream().filter(s->s.startsWith("D")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        System.out.println("-----------------------");
        System.out.println("MIN MAX");

       Optional<Dish> dishMin= DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        Optional<Dish> dishMax= DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println("min "+dishMin.get());
        System.out.println("max "+dishMax.get());

        System.out.println("_______________________");

        System.out.println("Dish calories total: ");

        int dishCalc=DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce(Integer::sum)
                .reduce((a,b)->a+b) //returns Optional and closes the stream
                .get(); //to get int result, otherwise it will be Optional
        System.out.println(dishCalc);

        System.out.println("_______________________");

        //max and min
        List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> min= numbers.stream().reduce(Integer::min);
        Optional<Integer> max= numbers.stream().reduce(Integer::max);
        Optional<Integer> sum= numbers.stream().reduce(Integer::sum);

        System.out.println("Min "+min.get());
        System.out.println("Max "+max.get());
        System.out.println("Sum "+sum.get());

        System.out.println("_______________________");
        System.out.println("COUNT");

        long dishCount= DishData.getAll().stream().count(); //how many dishes in the stream
        System.out.println(dishCount);








    }

}
