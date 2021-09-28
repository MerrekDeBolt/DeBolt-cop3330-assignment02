package ex26;

/*
 *  UCF COP3330 Fall 2021 Exercise 26 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

class PaymentCalculator
{
    public double balance;
    public double APR;
    public double monthlyPayment;

    public int calculateMonthsUntilPaidOff()
    {
        double i = (APR / 100) / 365;

        double n = (-(1.0/30.0) * Math.log(1.0 + (balance/monthlyPayment) * (1.0 - Math.pow(1.0 + i, 30.0))) / Math.log(1.0 + i));
        int result = (int) Math.ceil(n);

        return result;
    }
}

public class App {

    public static void main(String[] args)
    {
        PaymentCalculator calc = new PaymentCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your balance? ");
        calc.balance = scanner.nextDouble();

        System.out.println("What is the APR on the card (as a percent)? ");
        calc.APR = scanner.nextDouble();

        System.out.println("What is the monthly payment you can make? ");
        calc.monthlyPayment = scanner.nextDouble();

        int n = calc.calculateMonthsUntilPaidOff();

        System.out.println(String.format("It will take you %d months to pay off this card.", n));
    }
}