package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        //Here, we are using scanner, because to ask question to user to enter the values
        Scanner sc = new Scanner(System.in);
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
}
