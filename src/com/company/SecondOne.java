package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondOne {

    int a;
    int b;
    int[] array;
    Random random;
    Scanner scanner;

    public void invoke() {
        setup();
        runFunction();
        System.out.println(Arrays.toString(array));
    }

    private void runFunction() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > a && array[i] < b) {
                array[i] =
                        (i == 0 ? 0 : array[i -1]) + (i == array.length -1 ? 0 : array[i + 1]);
                System.out.println(array[i]);
            }
        }
    }

    private void setup() {
        random = new Random();
        scanner = new Scanner(System.in);
        setupArray();
        setupUserConfig();
    }

    private void setupUserConfig() {
        a = requestNumForConsole("Enter the min limit");
        b = requestNumForConsole("Enter the high limit");
    }

    private void setupArray() {
        int count = random.nextInt(100);
        array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(array));
    }

    private int requestNumForConsole(String messageForUser) {
        System.out.println(messageForUser);
        try {
            String input = scanner.next();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("pleas enter the number");
            return requestNumForConsole(messageForUser);
        }
    }
}
