package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1=374.56;
        double amount2=374.26;

        System.out.println(amount1-amount2);

        BigDecimal b1=new BigDecimal("374.56");
        BigDecimal b2=new BigDecimal("374.26");
        BigDecimal b3=BigDecimal.valueOf(374.56);
        BigDecimal b4=BigDecimal.TEN;
        BigDecimal b5=BigDecimal.ONE;

        System.out.println(b1.subtract(b2));
        System.out.println(b5);

        //Scaling
        BigDecimal number1=new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));

        //do not use equals(), use compareTo()

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2"))); //0
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2"))); //1
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2"))); //-1


    }
}

class Employee{
    private String name;
    private BigDecimal salary;
}
