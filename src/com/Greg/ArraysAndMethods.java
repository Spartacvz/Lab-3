package com.Greg;
// Allows user input
import java.util.Scanner;

public class ArraysAndMethods {

    public static void main(String[] args) {

        // Declares variable for user input
        int [] array;
        String input;
        Scanner myScanner = new Scanner(System.in);

        // Asks user for input
        System.out.println("Please input your numbers here: ");
        input = myScanner.nextLine();

        char[] charArray = input.toCharArray();



        String[] numbers = input.split("\\s");
        for (String n : numbers) {// Prints user input
            System.out.println(charArray);

        }
    }
}