package ex33;
/*
 *  UCF COP3330 Fall 2021 Exercise 33 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args)
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        String[] responses = { "Yes", "No", "Maybe", "Ask again later." };

        System.out.println("What's your question?");
        input = scanner.nextLine();

        Random rand = new Random();
        System.out.println("\n" + responses[rand.nextInt(responses.length)]);
    }
}