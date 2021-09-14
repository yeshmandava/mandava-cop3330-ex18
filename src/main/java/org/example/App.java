package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter C if you would like to convert from Fahrenheit to Celsius. \nEnter F if you would like to convert Celsius to Fahrenheit. \nYour Choice: ");
        //System.out.print("\nYour Choice: ");
        String choice = input.nextLine();

        //double CtoF = ()

        if(choice.equalsIgnoreCase("F")){

            System.out.print("Please enter the temperature in Celsius:  ");
            double TempC = input.nextInt();
            double CtoF = (((9*TempC)/5) + 32);
            System.out.printf("The temperature in Fahrenheit is %.1f", CtoF);
        }

        else if(choice.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature in Fahrenheit:  ");
            double TempF = input.nextInt();
            double FtoC = ((TempF-32) * 5/9);
            System.out.printf("The temperature in Celsius is %.1f", FtoC);
        }
    }

}
