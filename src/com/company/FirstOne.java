package com.company;

import java.util.Arrays;

public class FirstOne {

    public int[] deleteZeroAddOne(int[] args) {
        int elementsCount =
                args.length
                        - (int) Arrays.stream(args).filter(n -> n == 0).count()
                        + (int) Arrays.stream(args).filter(n -> n != 0 && n % 5 == 0).count();
        int[] result;
        result = new int[elementsCount];
        int i = 0;
        for (int arg : args) {
            if (elementsCount <= i || arg == 0) continue;
            result[i] = arg;
            if (arg % 5 == 0) {
                result[i + 1] = 1;
                i++;
            }
            i++;
        }

        return result;
    }


    public void invoke(int[] args) {
        System.out.println(Arrays.toString(deleteZeroAddOne(args)));
    }

}
