package com.cydeo.practice.appleTask2;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple(80, Color.GREEN));
        inventory.add(new Apple(155, Color.RED));
        inventory.add(new Apple(120, Color.GREEN));

        ApplePrintFormatter applePrintFormatter=apple-> "An apple is "+ apple.getWeight()+"g";
        prettyPrintApples(inventory, applePrintFormatter );
        System.out.println("-------------------");

        /*ApplePrintFormatter applePrintFormatter1=apple->{
            if(apple.getWeight()>130){
               return "A heavy "+apple.getColor()+ " apple";
            }else{
                return "A light "+apple.getColor()+ " apple";
            }
        };

         */
        ApplePrintFormatter applePrintFormatter1=apple->apple.getWeight()>200 ? "A heavy "+apple.getColor()+ " apple":
                "A light "+apple.getColor()+ " apple";

        prettyPrintApples(inventory, applePrintFormatter1 );

    }

    public static void prettyPrintApples(List<Apple> inventory, ApplePrintFormatter applePrintFormatter){

        for (Apple each : inventory) {
            String output=applePrintFormatter.accept(each);
            System.out.println(output);
        }
    }
}
