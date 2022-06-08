package ru.netology.sqr.Sqr.services;

public class SQRService {

    public static int calcSqrCount(int minValue, int maxValue) {
        if (maxValue < minValue)
            throw new IllegalArgumentException("invalid range");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int pow = (int) Math.pow(i, 2);
            if (pow >= minValue && pow <= maxValue) {
                count++;
            }
        }

        return count;
    }


}

