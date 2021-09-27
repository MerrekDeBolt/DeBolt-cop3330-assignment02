package ex34;
/*
 *  UCF COP3330 Fall 2021 Exercise 34 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static ArrayList<String> employees;

    public static void printEmployees()
    {
        System.out.println(String.format("There are %d employees: ", employees.size()));

        for (int index = 0; index < employees.size(); index++)
            System.out.println(employees.get(index));
    }

    public static void removeEmployee()
    {
        System.out.println("\nEnter an employee name to remove: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int index = 0; index < employees.size(); index++)
        {
            if (employees.get(index).equals(input))
            {
                employees.remove(index);
                index--;
            }
        }
    }

    public static void main(String[] args)
    {
        employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        printEmployees();
        removeEmployee();
        printEmployees();
    }
}