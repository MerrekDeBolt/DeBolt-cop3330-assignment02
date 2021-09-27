package ex38;
/*
 *  UCF COP3330 Fall 2021 Exercise 38 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static int[] stringToArray(String input)
    {
        int startIndex = 0, endIndex, arraySize = 1;

        for (int index = 0; index < input.length(); index++)
            if (input.charAt(index) == ' ')
                arraySize++;

        int[] array = new int[arraySize];
        int index2 = 0;
        for (int index = 0; index < input.length(); index++)
        {
            if (input.charAt(index) == ' ' || index == input.length() - 1)
            {
                endIndex = index;
                if (endIndex == startIndex)
                    endIndex++;

                array[index2] = Integer.parseInt(input.substring(startIndex, endIndex));
                startIndex = index + 1;
                index2++;
            }
        }

        return array;
    }

    public static int[] filterEvenNumbers(int[] origArray)
    {
        int evenAmount = 0;
        for (int index = 0; index < origArray.length; index++)
            if (origArray[index] % 2 == 0)
                evenAmount++;

        int[] newArray = new int[evenAmount];
        int index2 = 0;
        for (int index = 0; index < origArray.length; index++)
            if (origArray[index] % 2 == 0)
            {
                newArray[index2] = origArray[index];
                index2++;
            }

        return newArray;
    }

    public static void main(String[] args)
    {
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces:");
        input = scanner.nextLine();
        int[] evenArray = filterEvenNumbers(stringToArray(input));

        System.out.print("\nThe even numbers are");
        for (int index = 0; index < evenArray.length; index++)
            System.out.print(" " + evenArray[index]);

        System.out.print(".");
    }
}