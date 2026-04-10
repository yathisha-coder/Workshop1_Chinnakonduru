package org.example;

import java.util.Scanner;

public class FinanceCalculatorIfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Showing the options to the user
        System.out.println("Choose a option to calculate the finance: ");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Future Value calculator");
        System.out.println("3. Present Value");

        //Asking the user to select the option
        System.out.println("Enter your choice (1-3) to calculate: ");
        int option = sc.nextInt();

        //Mortgage Calculation
        //using if statements
        if(option == 1){
            //Here, we are asking the user to enter the principal amount
            System.out.println("Enter the principal amount: ");
            //Here, we are using double because the principal amount can be decimal also
            double principal = sc.nextDouble();
            //Showing the principal amount to the user
            System.out.println("Your principal amount: " + principal);

            //Here, we are asking the user to enter the interest rate
            System.out.println("Enter the interest rate percentage : % ");
            //Here, we are using double because the interest rate we are converting percentage to the decimal
            double interestRate = sc.nextDouble();
            //showing the interest rate to the user
            System.out.println("Your interest rate: %  " +interestRate);

            //Here, we are asking the user to enter the loan length in years
            System.out.println("Enter the number of years: ");
            //Here, we are using int because the loan length duration should be whole number
            int years = sc.nextInt();
            //Showing how many years of loan duration
            System.out.println("How many years of loan: " +years);

            //Here, Converting the values
            //Calculating the monthly interest
            double monthlyInterest = (interestRate/100)/12;
            //Calculating the total months
            int totalMonths = (years*12);
            //Showing the results that after converting the values
            System.out.println("Monthly Interest: " + monthlyInterest);
            System.out.println("Total Months: "+ totalMonths);

            //Calculating the monthly payment
            //Formula for compounded interest
            //M=p(r*(1+r)^n/((1+r)^n)-1)
            double monthlyPayment = principal*(monthlyInterest*Math.pow(1+monthlyInterest,totalMonths)/(Math.pow(1+monthlyInterest,totalMonths)-1));
            //Showing the results
            System.out.println("Monthly Payment: $"+monthlyPayment);

            //Calculate the total interest
            double total = monthlyPayment * totalMonths;
            double totalInterest = total - principal;
            //Showing the results
            System.out.println("Total Interest: $" + totalInterest);
        }
        //Future Value Calculation
        else if (option== 2) {
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

        }
        //Present Value Calculation
        else if (option == 3) {
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
        }
        //If user enter not give options
        else{
            //showing the user to invalid option
            System.out.println("You Enter the invalid option");
        }
    }
}
