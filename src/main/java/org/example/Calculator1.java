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
        //here, we are using double because the interest rate we are converting percentage to the decimal
        double interestRate = sc.nextDouble();
        //showing the interest rate to the user
        System.out.println("Your interest rate: %  " +interestRate);


    }
}
