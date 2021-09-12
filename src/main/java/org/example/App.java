/*
 * UCF COP3330 Fall 2021 Assignment 14 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the order amount?" );
        double amount = input.nextDouble();
        String newline = input.nextLine();

        System.out.println( "What is the state?" );
        String state = input.nextLine();

        System.out.println( "The subtotal is $" + amount);

        double tax = 0;

        if (state.equals("WI")) {
            tax += 0.55;
        }

        System.out.println("The tax is $" + tax);

        double total = amount + tax;

        System.out.println("The total is $" + total);
    }
}
