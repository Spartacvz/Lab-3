package com.Greg;

import java.util.Scanner;

public class ReducingReps {

    static double cup1, cup2, cup3, cup4;
    static  double price1, price2, price3, price4;

    //Create two scanners
    public static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {



        // Determine values
        QuantityNPrice();

    }

    static void QuantityNPrice()  {

        // Announcing programs intentions
        System.out.println("Coffee Shop Sales Calculator Program");

        // Coffee Quantity
        System.out.println("How many cups of coffee did you sell today?");
        int cup1 = numberScanner.nextInt();
        // Coffee price
        System.out.println("What does a cup of coffee cost?");
        double price1 = numberScanner.nextDouble();

        // Coffee Quantity
        System.out.println("How many cups of cappuccino did you sell today?");
        int cup2 = numberScanner.nextInt();
        // Coffee price
        System.out.println("What does a cup of cappuccino cost?");
        double price2 = numberScanner.nextDouble();

        // Coffee Quantity
        System.out.println("How many cups of tea did you sell today?");
        int cup3 = numberScanner.nextInt();
        // Coffee price
        System.out.println("What does a cup of tea cost?");
        double price3 = numberScanner.nextDouble();

        // Coffee Quantity
        System.out.println("How many cups of hot chocolate did you sell today?");
        int cup4 = numberScanner.nextInt();
        // Coffee price
        System.out.println("What does a cup of hot chocolate cost?");
        double price4 = numberScanner.nextDouble();

        double totalSales = ((cup1 * price1) + (cup2 * price2) + (cup3 * price3) + (cup4 * price4));
        System.out.println("The total sales today were $" + totalSales);

    }
}
