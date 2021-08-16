package com.epam;

import java.util.*;

public class RunnerOptionalTasks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        InputCheck.checkInput(scanner);
        int number = scanner.nextInt();
        Deque<Integer> reversedNumber = getReverseNumbers(number);
        printReversedNumber(reversedNumber);
    }

    private static Deque<Integer> getReverseNumbers(int number) {
        String stringNumber = String.valueOf(Math.abs(number));
        Deque<Integer> reversedNumber = new ArrayDeque<>();
        for (int i = 0; i < stringNumber.length(); i++) {
            if ((i+1) == stringNumber.length() && number < 0) {
                int currentNumber = Character.getNumericValue(stringNumber.charAt(i));
                currentNumber = currentNumber * -1;
                reversedNumber.push(currentNumber);
            } else {
                reversedNumber.push(Character.getNumericValue(stringNumber.charAt(i)));
            }
        }
        return reversedNumber;
    }

    private static void printReversedNumber(Deque<Integer> reversedNumber) {
        for (int item : reversedNumber) {
            System.out.print(item);
        }
    }
}


