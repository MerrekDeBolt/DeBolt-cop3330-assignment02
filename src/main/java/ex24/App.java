package ex24;

/*
 *  UCF COP3330 Fall 2021 Exercise 24 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static boolean isAnagram(String str1, String str2)
    {
        boolean returnVal = false;

        if (str1.length() != str2.length())
            return false;

        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        return Arrays.equals(chr1, chr2);
    }

    public static void main(String[] args)
    {
        String input, str1, str2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        input = scanner.nextLine();
        str1 = input;

        System.out.println("Enter the second string: ");
        input = scanner.nextLine();
        str2 = input;

        boolean anagram = isAnagram(str1, str2);

        System.out.print(String.format("\"%s\" and \"%s\" are ", str1, str2));
        if (!anagram)
            System.out.print("not ");
        System.out.print("anagrams.");
    }
}