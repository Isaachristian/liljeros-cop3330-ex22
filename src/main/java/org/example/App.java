/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Comparing Numbers
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        double numbers[] = new double[3];

        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt();
        System.out.print("Enter the third number: ");
        numbers[2] = scanner.nextInt();

        double highestNumber = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > highestNumber)
                highestNumber = numbers[i];
        }

        System.out.println("The highest number is " + highestNumber);
    }
}
