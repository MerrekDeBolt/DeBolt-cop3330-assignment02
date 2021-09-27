package ex35;
/*
 *  UCF COP3330 Fall 2021 Exercise 35 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    static ArrayList<String> people;

    public static void takeInputs()
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        people = new ArrayList<String>();

        for (;;)
        {
            System.out.println("Enter a name: ");
            input = scanner.nextLine();

            if (!input.equals(""))
                people.add(input);
            else return;
        }
    }

    public static void selectWinner()
    {
        Random rand = new Random();
        int winner = rand.nextInt(people.size());
        System.out.println("\nThe winner is... " + people.get(winner));
    }

    public static void main(String[] args)
    {
        takeInputs();
        selectWinner();
    }
}