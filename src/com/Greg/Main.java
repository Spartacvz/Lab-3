package com.Greg;

import java.util.Scanner;

// MPG Calculator
public class Main {

    static Scanner numScan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many miles did you drive?");
        double milesDriven = numScan.nextDouble();

        System.out.println("How much gas did you use?");
        double gasGallons = numScan.nextDouble();

        double mpg = getMPG(milesDriven, gasGallons);
        System.out.println("Your miles per gallon is " + mpg);
    }

    private static double getMPG(double milesDriven, double gasGallons) {
        return milesDriven/gasGallons;
    }
}
