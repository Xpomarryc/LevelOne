package com.epam;

public class MainTask4 {

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    sum += Integer.parseInt(args[i]);
                    product *= Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid command line argument!");
                }
            }
            System.out.println("Sum = " + sum);
            System.out.println("Product = " + product);
        } else {
            System.out.println("There are no command line arguments!");
        }
    }
}
