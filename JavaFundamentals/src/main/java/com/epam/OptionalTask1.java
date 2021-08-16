package com.epam;

import java.util.Scanner;

public class OptionalTask1 {

    public static void main(String[] args) {
        System.out.println("Enter number amount:");
        Scanner in = new Scanner(System.in);
        InputCheck.checkInput(in);
        int numberOfValues = in.nextInt();
        System.out.println("Enter your numbers:");
        int[] array = new int[numberOfValues];
        for (int i = 0; i < numberOfValues; i++) {
            InputCheck.checkInput(in);
            array[i] = in.nextInt();
        }
        int maxIndex = maxLengthIndex(array);
        int maxValue = array[maxIndex];
        int minIndex = minLengthIndex(array);
        int minValue = array[minIndex];
        System.out.println("Value with max length is " + maxValue);
        System.out.println("Max length is " + String.valueOf(Math.abs(maxValue)).length());
        System.out.println("Value with min length is " + minValue);
        System.out.println("Min length is " + String.valueOf(Math.abs(minValue)).length());
    }

    private static int maxLengthIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            int maxLength = String.valueOf(Math.abs(values[maxIndex])).length();
            int valueLength = String.valueOf(Math.abs(values[i])).length();
            if (valueLength > maxLength) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int minLengthIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            int minLength = String.valueOf(Math.abs(values[minIndex])).length();
            int valueLength = String.valueOf(Math.abs(values[i])).length();
            if (valueLength < minLength) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
