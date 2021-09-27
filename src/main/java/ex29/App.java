package ex29;

/*
 *  UCF COP3330 Fall 2021 Exercise 29 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double years, rate = -1;
        Scanner scanner = new Scanner(System.in);

        while (rate == -1)
        {
            System.out.println("What is the rate of return? ");

            input = scanner.nextLine();
            try { rate = Double.parseDouble(input); }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                rate = -1;
            }

            if (rate < 0)
            {
                System.out.println("Sorry. That's not a valid input.");
                rate = -1;
            }
            else if (rate == 0)
            {
                System.out.println("Sorry. That is the number zero actually.");
                rate = -1;
            }
        }

        years = 72 / rate;
        System.out.println(String.format("It will take %f years to double your initial investment.", years));
    }
}