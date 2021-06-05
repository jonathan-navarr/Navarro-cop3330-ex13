package org.example;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class CompoundedInterst {
    public static void main(String[] args){
        double principal, interest, amount;
        int years, perYear;
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        principal = scnr.nextDouble();
        String strPrincipal = String.format("%.2f", principal);
        System.out.print("What is the rate? ");
        interest = scnr.nextDouble();
        String strInterest = String.format("%.2f", interest);
        System.out.print("What is the number of years? ");
        years = scnr.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        perYear = scnr.nextInt();
        amount = principal * (Math.pow((1+((interest/100)/perYear)),(perYear*years)));
        String strAmount = String.format("%.2f", amount);
        System.out.print( strPrincipal + "invest at " + strInterest + " for " + years + " years compounded " + perYear + " times per year is $" + strAmount);

    }
}
