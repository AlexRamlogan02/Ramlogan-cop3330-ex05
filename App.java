package org.example;


import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        //objective: simple math
        Scanner scan = new Scanner(System.in);
        float x,y;
        float add, sub, div, mult;
        System.out.print("What's the first number?: ");
        x = scan.nextFloat(); //scans an integer
        System.out.print("What's the second number?: ");
        y = scan.nextFloat();
        //If the input was a string, to convert to an int, the code would be "int add + Integer.parseInt(string);"
        //output
        add = (x+y);
        sub = (x-y);
        div = (x/y);
        mult = (x*y);
        System.out.println(x +" + " +y +" = " +add +"\n" +x +" - " +y +" = " +sub +"\n" +x +" / " +y +" = " +div +"\n" +x +" * " +y +" = " +mult);
        //I made it  floats just in case!
    }
}
