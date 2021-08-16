package com.epam;

import java.util.Scanner;

public class InputCheck {

    public static void checkInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
    }
}
