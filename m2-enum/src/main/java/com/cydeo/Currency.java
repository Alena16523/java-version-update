package com.cydeo;

public enum Currency {

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    //PENNY is a constant object of the Currency class



    int value;

    Currency(int value) {
        this.value = value;
    }

}
