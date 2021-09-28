package ex37;
/*
 *  UCF COP3330 Fall 2021 Exercise 37 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static int[] getNumbers(int numCount)
    {
        int[] numbers = new int[numCount];

        Random rand = new Random();
        for (int index = 0; index < numCount; index++)
            numbers[index] = rand.nextInt(10);

        return numbers;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the minimum length? ");
        int length = scanner.nextInt();

        System.out.println("How many special characters? ");
        int specialCount = scanner.nextInt();

        System.out.println("How many numbers? ");
        int numCount = scanner.nextInt();

        int[] numbers = getNumbers(numCount);
        char[] specials = getSpecials(specialCount);
        ArrayList<Character> letters = getLetters(length,specialCount,numCount);

        String password = generatePassword(numbers,specials,letters);
        System.out.println("Your password is "+password);
    }
}