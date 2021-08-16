package com.epam;

import java.util.Scanner;

public class MainTask1 {

    public static void main(String[] args) {
        System.out.println("Enter name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
