package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Asking the user to enter the initial deposit amount
        System.out.println("Enter the deposit amount: ");
        double initialDepositAmount =sc.nextDouble();
        //Showing the deposit amount
        System.out.println("Your initial deposit amount: $" + initialDepositAmount);

        //Asking the user to enter the interest rate
        System.out.println("Enter the interest rate : "+"%");
        double interestRate = sc.nextDouble();
        //showing the interest rate
        System.out.println("your interest rate: "+ interestRate +"%");

        //Asking the user to enter the number of years
        System.out.println("Enter the number of the years: ");
        int numberOfYears = sc.nextInt();
        //Showing the number of years
        System.out.println("Your total number of years: " + numberOfYears);

        //converting the interest rate
        double annualInterestRate = interestRate/100;
        //showing the results
        System.out.println("Total annual interest rate: " + annualInterestRate);

        //Calculating the future value
        //Fv = (p * (1 + (r/365))^(365 * t))
        double futureValue = (initialDepositAmount * Math.pow((1 + annualInterestRate/365),(365*numberOfYears)));
        //showing the results
        System.out.println("Future Value : " + futureValue);

        //calculating the total interest rate
        double totalInterestRate = futureValue - initialDepositAmount;
        // showing the results
        System.out.println("Total Interest Rate : " + totalInterestRate);

        //closing the scanner
        sc.close();
    }
}
