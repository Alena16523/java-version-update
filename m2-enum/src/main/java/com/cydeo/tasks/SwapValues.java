package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
     //swapping 2 numbers with generics
        Integer[] a={1,2,3,4};
        swap(a, 0,2);
        System.out.println(Arrays.toString(a));

    }

    public static <T> void swap(T[] a, int i, int j){
        T temp=a[i]; //bucket method
        a[i]=a[j];
        a[j]=temp;
    }
}
