package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // #1
        System.out.println("start");
        int[] ints = {3, 0, 55, 3, 0, 25, 3, 0, 5, 3, 0, 445, 3, 0, 5, 3, 0, 5, 3, 0, 5, 3};
        String res = Arrays.toString(FirstOne.invoke(ints));
        System.out.println(res);
    }
}
