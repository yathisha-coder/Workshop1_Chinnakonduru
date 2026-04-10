package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ask the user to enter the monthly payout
        System.out.println("Enter the monthly payout: ");
        double monthlyPayout = sc.nextDouble();
        //Showing the monthly payout to the user
        System.out.println("Your monthly payout: " + monthlyPayout);

        //Ask the user to enter the interest rate
        System.out.println("Enter the interest rate: ");
        double interestRate = sc.nextDouble();
        //showing the interest rate to the user
        System.out.println("interest rate : " + interestRate);

        //Ask the user to enter the number of years
        System.out.println("Enter the number of years: ");
        int numberOfYears = sc.nextInt();
        //showing the number of years to the user
        System.out.println("total number of years: " + numberOfYears);

        //Converting the values and calculating the monthly interest
        double monthlyInterestRate = (interestRate/100)/12;
        //showing the results
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);

        //Calculating the total months
        int totalMonths = numberOfYears * 12;
        //showing the results
        System.out.println("Total Number of Months: " + totalMonths);

        //Calculating the present value
        //pv = (P * (1 - (1+r)^-n)/r)
        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate,-totalMonths))/monthlyInterestRate;

        //Showing the results
        System.out.println("Present Value: " + presentValue);

        //closing the Scanner
        sc.close();
    }
}
