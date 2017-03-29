package com.Greg;

public class Percents {

    public static void main(String[] args) {

        printSchedule(1);
        printSchedule(5);
        printSchedule(10);
    }
    private static void printSchedule(double percent){
        int week = 1;
        double miles = 1;
        double marathon = 26.2;
        String output = " ";


        while (miles <= marathon){
            week += 1;
            miles += (percent * .01);
            output = String.format("%.2f", miles);

            System.out.println("In week " + week + " you ran " + miles + " miles");
        }
    }
}
