package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /* #1
        int[] ints = {3, 0, 55, 3, 0, 25, 3, 0, 5, 3, 0, 445, 3, 0, 5, 3, 0, 5, 3, 0, 5, 3};
        new FirstOne().invoke(ints)
         */

        // #2
        //new SecondOne().invoke();

        // #3
        // ничего не понял. тупо все удалить? в чем смысл?

        // #4
        //System.out.println(Arrays.toString(reverseArray(new int[]{0, 1, 2})));

        // #5
        //System.out.println(countOfEvenNumOnTheEvenIndex(new int[]{0, 2, 2, 2, 2}));

        // #6
        //System.out.println(Arrays.toString(sixth(new int[]{21, 522, 522, 212, 552})));

        // #7
        //System.out.println(Arrays.toString(seventh(new int[]{21, 522, 522, 15, 212, 552})));

        // #8
        //System.out.println(eighth(new int[]{21, 522, 522, 15, 212, 552, 15}, requestNumForConsole("Enter the number")));


    }

    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] b = new int[n];
        int j = n;
        for (int k : array) {
            b[j - 1] = k;
            j = j - 1;
        }
        return b;
    }

    public static int countOfEvenNumOnTheEvenIndex(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 == 0 && array[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] sixth(int[] array) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            String lastNumber = String.valueOf(array[i - 1] % 10);
            String currentNumber = String.valueOf(array[i]);
            int count = currentNumber.length() - currentNumber.replace(lastNumber, "").length();
            if (count >= 2)
                indexes.add(i);
        }
        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) result[i] = indexes.get(i);
        return result;
    }

    public static int[] seventh(int[] array) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if(array[i] != 0 && array[i] % 3 == 0 && array[i] % 5 == 0)
                indexes.add(i);
        }
        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) result[i] = indexes.get(i);
        return result;
    }

    public static int eighth(int[] array, int target) {
        int count = 0;
        for (int i : array) {
            if(i == target) count++;
        }
        return count;
    }

    private static int requestNumForConsole(String messageForUser) {
        System.out.println(messageForUser);
        try {
            String input = new Scanner(System.in).next();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("pleas enter the number");
            return requestNumForConsole(messageForUser);
        }
    }
}
