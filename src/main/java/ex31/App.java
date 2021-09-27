package ex31;
/*
 *  UCF COP3330 Fall 2021 Exercise 31 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static int TakeInput()
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        int value = -1;

        while (value == -1)
        {
            input = scanner.nextLine();
            try { value = Integer.parseInt(input); }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                value = -1;
            }

            if (value < 0)
            {
                System.out.println("Sorry. That's not a valid input.");
                value = -1;
            }
            else if (value == 0)
            {
                System.out.println("Sorry. That is the number zero actually.");
                value = -1;
            }
        }

        return value;
    }

    public static void main(String[] args)
    {
        int pulse, age, targetHeartRate;

        System.out.println("What is your resting pulse? ");
        pulse = TakeInput();

        System.out.println("What is your age? ");
        age = TakeInput();

        System.out.println(String.format("Resting Pulse: %d           Age: %d", pulse, age));
        System.out.println("\nIntensity | Rate");
        System.out.println("----------------");

        for (int intensity = 55; intensity <= 95; intensity += 5)
        {
            targetHeartRate = (int) Math.round(((((220 - age) - pulse) * ((double) intensity/100.0))+ pulse));
            System.out.println(String.format("%d%%       | %d bpm", intensity, targetHeartRate));
        }
    }
}