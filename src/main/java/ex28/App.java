package ex28;

/*
 *  UCF COP3330 Fall 2021 Exercise 28 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 5; index++)
        {
            System.out.println("Enter a number: ");
            total += scanner.nextDouble();
        }

        System.out.println(String.format("The total is %d.", total));
    }
}