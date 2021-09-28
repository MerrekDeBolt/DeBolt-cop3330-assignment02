package ex37;
/*
 *  UCF COP3330 Fall 2021 Exercise 37 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.ArrayList;
import java.util.Collections;
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

    public static char[] getSpecials(int specialCount)
    {
        char[] chars = new char[specialCount];
        Random rand = new Random();

        ArrayList<Character> Specials = new ArrayList<Character>();
        Collections.addAll(Specials,'!','\"','#','$','%','&','(',')','*','+',',','-','.','/',':',';','<','=','>','?','@','[',']','^','_','`','{','}','|','~');

        for(int index = 0; index < specialCount; index++)
            chars[index] = Specials.get((rand.nextInt(31)));

        return chars;
    }

    public static char[] getLetters(int length, int specialCount, int numCount)
    {
        int totalChars = specialCount + numCount;
        if(length - specialCount - numCount > totalChars)
            totalChars = length - specialCount - numCount;

        char[] chars = new char[totalChars];
        Random rand = new Random();

        for (int index = 0; index < totalChars; index++)
            chars[index] = (char) (rand.nextInt(26) + 'a');

        return chars;
    }

    public static String generatePassword(int[] numbers, char[] specials, char[] letters, int length)
    {
        ArrayList<Character> combined = new ArrayList<Character>();

        for(int index = 0; index < numbers.length; index++)
            combined.add( (char) (numbers[index] + '0'));
        for(int index = 0; index < specials.length; index++)
            combined.add(specials[index]);
        for(int index = 0; index < letters.length; index++)
            combined.add(letters[index]);

        Collections.shuffle(combined);
        String output = "";
        for(int index = 0; index < combined.size(); index++)
            output += combined.get(index);

        return output;
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
        char[] letters = getLetters(length,specialCount,numCount);

        String password = generatePassword(numbers, specials, letters, length);
        System.out.println("Your password is " + password);
    }
}