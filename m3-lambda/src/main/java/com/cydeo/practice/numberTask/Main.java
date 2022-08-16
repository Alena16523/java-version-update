package com.cydeo.practice.numberTask;

public class Main {

    public static void main(String[] args) {

        TwoParameters twoParameters=(a, b)-> a+b;

        System.out.println(calculateNumbers(5, 7, twoParameters));


    }

    public static int calculateNumbers(int a, int b, TwoParameters twoParameters){
       return  twoParameters.calculate(a, b);
    }

}
