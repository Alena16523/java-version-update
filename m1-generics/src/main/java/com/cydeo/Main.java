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

            Team<SoccerPLayer> liverpool=new Team("Liverpool"); //team accepting any object ->problem
            //liverpool.addPlayer(joe); they do not belong as were created from other classes
            //liverpool.addPlayer(pat);
            liverpool.addPlayer(beckham);

            //Team<String> brokenTeam=new Team<>("what kin dof team is this?");

            //Team<Integer> t2=new Team<>("Very wierd");










        }

        private static void printDoubled(ArrayList items) {
            for (Object i: items ){
                System.out.println((Integer)i*2);
            }
        }

    }

