package ex32;
/*
 *  UCF COP3330 Fall 2021 Exercise 32 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

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
        String input;
        Scanner scanner = new Scanner(System.in);
        int difficulty, answer = 0, guess, guessCount = 0;

        System.out.println("Let's play \"Guess the Number\"!");

        boolean playing = true;
        boolean incorrect;
        while (playing)
        {
            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            difficulty = TakeInput();

            Random rand = new Random();
            switch (difficulty) {
                case 1:
                    answer = rand.nextInt(10) + 1;
                    break;
                case 2:
                    answer = rand.nextInt(100) + 1;
                    break;
                case 3:
                    answer = rand.nextInt(1000) + 1;
                    break;
            }

            incorrect = true;
            System.out.println("I have my number. What's your guess? ");
            while (incorrect)
            {
                guess = TakeInput();
                guessCount++;

                if (guess == answer)
                {
                    incorrect = false;
                    System.out.println(String.format("You got it in %d guesses!\n\nDo you wish to play again?", guessCount));
                    guessCount = 0;

                    do
                    {
                        input = scanner.nextLine();
                        input = input.toLowerCase(Locale.ROOT);

                        if (input.equals("n"))
                            playing = false;

                        if (!input.equals("y") && !input.equals("n"))
                            System.out.println("Please enter Y/y or N/n");
                    }
                    while (!input.equals("y") && !input.equals("n"));
                }
                else if (guess > answer)
                    System.out.println("Too high. Guess again: ");
                else if (guess < answer)
                    System.out.println("Too low. Guess again: ");
            }
        }
    }
}