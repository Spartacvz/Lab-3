package com.Greg;

import java.util.Scanner;

public class AgileOrWaterfall {

    static Scanner numScan = new Scanner(System.in);
    static Scanner strScan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many programmers will be on the team? ");
        double progs = numScan.nextDouble();

        System.out.println("Do you need to have firm deadlines and a fixed schedule? ");
        boolean fixSched = boolValu(strScan.nextLine());

        System.out.println("If the programmers have experience in requirements, analysis and testing as well as coding? ");
        boolean reqs = boolValu(strScan.nextLine());

        System.out.println("If there are stringent quality control requirements? ");
        boolean qCtrl = boolValu(strScan.nextLine());

        System.out.println("If early integration is desirable? ");
        boolean earlyInt = boolValu(strScan.nextLine());

        System.out.println("If the customer will be requiring working models early in the process? ");
        boolean workMod = boolValu(strScan.nextLine());

        agileOrWaterfall(progs, fixSched, reqs, qCtrl, earlyInt, workMod);
    }
    public static void agileOrWaterfall(double progs, boolean fixSched, boolean reqs, boolean qCtrl, boolean earlyInt, boolean workMod) {

        int agile = 0;
        int watfal = 0;

        if (progs < 25)
        {agile += 1;}
        else {watfal += 1;}

        if (fixSched)
        {agile += 1;}
        else {watfal += 1;}

        if (reqs)
        {agile += 1;}
        else {watfal += 1;}

        if (qCtrl)
        {agile += 1;}
        else {watfal += 1;}

        if (earlyInt)
        {agile += 1;}
        else {watfal += 1;}

        if (workMod)
        {agile += 1;}
        else {watfal += 1;}

    }

    private static boolean boolValu(String reply) {
        if (reply.equals("y") | reply.equals("y")){
            return true;
        }
        else if (reply.equals("y") | reply.equals("y")) {
            return false;
        }
        return false;
    }
}