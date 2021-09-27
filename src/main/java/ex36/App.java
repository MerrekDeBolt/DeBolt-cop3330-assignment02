package ex36;
/*
 *  UCF COP3330 Fall 2021 Exercise 36 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList<Integer> takeInputs()
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> responses = new ArrayList<Integer>();

        for (;;)
        {
            System.out.println("Enter a number: ");
            input = scanner.nextLine();

            if (!input.equals("done"))
            {
                try { responses.add(Integer.parseInt(input)); }
                catch (Exception e) { System.out.println("Invalid input. Please enter numbers or done only"); }
            }
            else return responses;
        }
    }

    public static int average(ArrayList<Integer> responses)
    {
        int value = 0;
        for (int index = 0; index < responses.size(); index++)
            value += responses.get(index);
        value /= responses.size();

        return value;
    }

    public static int min(ArrayList<Integer> responses)
    {
        int value = responses.get(0);
        for (int index = 0; index < responses.size(); index++)
            if (value > responses.get(index))
                value = responses.get(index);

        return value;
    }

    public static int max(ArrayList<Integer> responses)
    {
        int value = 0;
        for (int index = 0; index < responses.size(); index++)
            if (value < responses.get(index))
                value = responses.get(index);

        return value;
    }

    public static double std(ArrayList<Integer> responses)
    {
        double mean = average(responses);
        double total = 0;

        for(int index = 0; index < responses.size(); index++)
            total += Math.pow( (double) responses.get(index) - mean, 2);

        total /= responses.size();
        return Math.sqrt(total);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> responses = takeInputs();

        System.out.println("\nThe average is " + average(responses));
        System.out.println("\nThe minimum is " + min(responses));
        System.out.println("\nThe maximum is " + max(responses));
        System.out.println(String.format("\nThe standard deviation is %.2f", std(responses)));
    }
}