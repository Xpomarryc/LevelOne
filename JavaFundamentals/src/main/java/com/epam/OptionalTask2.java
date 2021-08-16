package com.epam;

import java.util.Scanner;

public class OptionalTask2 {

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
        double averageLength = 0;
        for (int i = 0; i < array.length; i++) {
            averageLength += String.valueOf(Math.abs(array[i])).length();
        }
        averageLength /= array.length;
        System.out.println("Average length is " + averageLength);
        System.out.println("Values below average length:");
        for (int i = 0; i < array.length; i++) {
            int valueLength = String.valueOf(Math.abs(array[i])).length();
            if (valueLength < averageLength) {
                System.out.println("Value " + array[i] + ", length " + valueLength);
            }
        }
        System.out.println("Values above average length:");
        for (int i = 0; i < array.length; i++) {
            int valueLength = String.valueOf(Math.abs(array[i])).length();
            if (valueLength > averageLength) {
                System.out.println("Value " + array[i] + ", length " + valueLength);
            }
        }
    }
}