package com.cydeo;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            ArrayList<Integer> items=new ArrayList<Integer>();
            //array list only accepts objects belongs to Integer class
            items.add(1);
            items.add(2);
            items.add(3);
            items.add(4);
            //items.add("Apple"); does not belong

            printDoubled(items);




        }

        private static void printDoubled(ArrayList items) {
            for (Object i: items ){
                System.out.println((Integer)i*2);
            }
        }

    }

