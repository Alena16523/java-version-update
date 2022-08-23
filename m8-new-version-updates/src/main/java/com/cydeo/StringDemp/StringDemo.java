package com.cydeo.StringDemp;

public class StringDemo {
    public static void main(String[] args) {

        var str="Mike \n Ozzy \n Tom";

        str.lines().forEach(System.out::println);
    }
}
