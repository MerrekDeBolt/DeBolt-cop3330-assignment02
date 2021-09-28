package ex28;

/*
 *  UCF COP3330 Fall 2021 Exercise 28 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static int getTotal(ArrayList<Integer> integers)
    {
        int total = 0;
        for (int index = 0; index < 5; index++)
            total += integers.get(index);

        return total;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 5; index++)
        {
            System.out.println("Enter a number: ");
            integers.add(scanner.nextInt());
        }

        System.out.println(String.format("The total is %d.", getTotal(integers)));
    }
}