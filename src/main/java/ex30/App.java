package ex30;

/*
 *  UCF COP3330 Fall 2021 Exercise 30 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        int num;
        for (int x = 1; x <= 12; x++)
        {
            for (int y = 1; y <= 12; y++)
            {
                num = x * y;
                System.out.print(String.format("%5d", num));
            }

            System.out.println("");
        }
    }
}