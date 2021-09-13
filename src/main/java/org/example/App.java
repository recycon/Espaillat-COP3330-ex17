package org.example;

import java.util.Scanner;

/**
 * Enter a 1 is you are male or a 2 if you are female: 1
 * How many ounces of alcohol did you have? 3
 * What is your weight, in pounds? 175
 * How many hours has it been since your last drink? 1
 *
 * Your BAC is 0.049323
 * It is legal for you to drive.
 *
 */


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App {
    public static void main(String[] args) {
        /////BAC = (A × 5.14 / W × r) − .015 × H
        ///A is total alcohol consumed, in ounces (oz).
        //W is body weight in pounds.
        //r is the alcohol distribution ratio:
        //0.73 for men
        //0.66 for women
        //H is number of hours since the last drink.
        Scanner in = new Scanner(System.in);
        double BAC, r, A, W;
        int H;

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        int mOrF = in.nextInt();
        if (mOrF == 1) {
            r = 0.73;
        } else {
            r = 0.66;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        A = in.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        W = in.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        H = in.nextInt();
        double v = 5.14 / W;
        double x = (double) H;
        double v1 = .015;
        BAC = (A * v * r) - v1 * x;

        System.out.println("\nYour BAC is "+BAC);
        if (BAC > 0.08) {
            System.out.println("It is not legal for you to drive.");
        } else {
            System.out.println("It is legal for you to drive.");
        }
    }
}
