package ex27;

/*
 *  UCF COP3330 Fall 2021 Exercise 27 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static boolean IsStringEmpty(String string)
    {
        if (string.equals("") || string == null)
            return true;
        else
            return false;
    }

    public static boolean IsStringTooShort(String string)
    {
        if (string.length() < 2 || string == null)
            return true;
        else
            return false;
    }

    public static boolean IsEIDFormatted(String string)
    {
        char[] chars = string.toCharArray();

        // Makes sure the length is correct
        if (string.length() != 7)
            return false;

        // Makes sure first and second characters are letters
        if (!Character.isLetter(chars[0]))
            return false;
        if (!Character.isLetter(chars[1]))
            return false;

        // Makes sure third
        if (chars[2] != '-')
            return false;

        // Makes sure the fourth to seventh characters are numbers
        if (!Character.toString(chars[3]).matches(".*\\d.*"))
            return false;
        if (!Character.toString(chars[4]).matches(".*\\d.*"))
            return false;
        if (!Character.toString(chars[5]).matches(".*\\d.*"))
            return false;
        if (!Character.toString(chars[6]).matches(".*\\d.*"))
            return false;

        return true;
    }

    public static boolean IsZIPValid(String string)
    {
        // Makes sure the length is correct
        if (string.length() != 5)
            return false;

        // Returns false if a non-number is found.
        for (int index = 0; index < string.length(); index++)
            if (!Character.isDigit(string.charAt(index)))
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        String input, output = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        input = scanner.nextLine();
        if (IsStringTooShort(input))
            output += "\nThe first name must be at least 2 characters long.";
        if (IsStringEmpty(input))
            output += "\nThe first name must be filled in.";

        System.out.println("Enter the last name: ");
        input = scanner.nextLine();
        if (IsStringTooShort(input))
            output += "\nThe last name must be at least 2 characters long.";
        if (IsStringEmpty(input))
            output += "\nThe last name must be filled in.";

        System.out.println("Enter the ZIP code: ");
        input = scanner.nextLine();
        if (!IsZIPValid(input))
            output += "\nThe zipcode must be a 5 digit number.";

        System.out.println("Enter the employee ID: ");
        input = scanner.nextLine();
        if (!IsEIDFormatted(input))
            output += "\nThe employee ID must be in the format of AA-1234.";

        if (output.equals(""))
            output = "\nThere were no errors found.";

        System.out.println(output);
    }
}