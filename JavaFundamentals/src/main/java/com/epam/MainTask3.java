package com.epam;

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {

    public static void main(String[] args) {
        System.out.println("Enter number amount:");
        Scanner in = new Scanner(System.in);
        InputCheck.checkInput(in);
        int amount = in.nextInt();
        if (amount > 0) {
            final Random random = new Random();
            boolean newLine = false;
            for (int i = 0; i < amount; i++) {
                if (newLine) {
                    System.out.println(random.nextInt() + " ");
                    newLine = false;
                } else {
                    System.out.print(random.nextInt() + " ");
                    newLine = true;
                }
            }
        } else {
            System.out.println("Amount is zero or negative!");
        }
    }
}
