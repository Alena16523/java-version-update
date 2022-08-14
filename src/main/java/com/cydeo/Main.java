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

            System.out.println("-------------------------------------");

            FootballPlayer joe=new FootballPlayer("Joe");
            BaseballPlayer pat=new BaseballPlayer("Pat");
            SoccerPLayer beckham =new SoccerPLayer("Beckham");

            Team liverpool=new Team("Liverpool"); //team accepting any object ->problem
            liverpool.addPlayer(joe);
            liverpool.addPlayer(pat);
            liverpool.addPlayer(beckham);






        }

        private static void printDoubled(ArrayList items) {
            for (Object i: items ){
                System.out.println((Integer)i*2);
            }
        }

    }

