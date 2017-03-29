package com.Greg;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFishGame {

    // Use deck to create a list of
    static ArrayList<String> deck = new ArrayList<String>();
    static ArrayList<String> userHand = new ArrayList<String>();
    static ArrayList<String> computerHand = new ArrayList<String>();
    private static Scanner request = new Scanner(System.in);


    public static void main(String[] args) {

        Deck();
        UserHand();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //ComputerHand();

        System.out.println("It is your turn, request a card and press 'ENTER'. Your hand is displayed above.");
        String userTurn = request.nextLine();

    }


    private static void ComputerHand()  {

        
        /// TODO change this method to work like UserHand() 
        // Create seven slots
        int rand1 = (int) ((Math.random() * deck.size()));
        int rand2 = (int) ((Math.random() * deck.size()));
        int rand3 = (int) ((Math.random() * deck.size()));
        int rand4 = (int) ((Math.random() * deck.size()));
        int rand5 = (int) ((Math.random() * deck.size()));
        int rand6 = (int) ((Math.random() * deck.size()));
        int rand7 = (int) ((Math.random() * deck.size()));

        Object CPUcard1 = deck.get(rand1);   // Pull a random card from deck
        Object CPUcard2 = deck.get(rand2);   // Pull a random card from deck
        Object CPUcard3 = deck.get(rand3);   // Pull a random card from deck
        Object CPUcard4 = deck.get(rand4);   // Pull a random card from deck
        Object CPUcard5 = deck.get(rand5);   // Pull a random card from deck
        Object CPUcard6 = deck.get(rand6);   // Pull a random card from deck
        Object CPUcard7 = deck.get(rand7);   // Pull a random card from deck


        // Display the seven random cards
        System.out.println(CPUcard1);
        System.out.println(CPUcard2);
        System.out.println(CPUcard3);
        System.out.println(CPUcard4);
        System.out.println(CPUcard5);
        System.out.println(CPUcard6);
        System.out.println(CPUcard7);

        deck.remove(rand1);
        deck.remove(rand2);
        deck.remove(rand3);
        deck.remove(rand4);
        deck.remove(rand5);
        deck.remove(rand6);
        deck.remove(rand7);

//        computerHand.add(rand1);
//        computerHand.add(rand2);
//        computerHand.add(rand3);
//        computerHand.add(rand4);
//        computerHand.add(rand5);
//        computerHand.add(rand6);
//        computerHand.add(rand7);

    }


    private static void UserHand()  {

        for (int x = 0 ; x < 7 ; x++)  {

            int random = (int) ((Math.random() * deck.size()));
            String card1 = deck.get(random);   // Pull a random card from deck
            //System.out.println(card1);
            deck.remove(random);
            userHand.add(card1);

        }

        System.out.println(userHand);



        // Create seven slots
        /*
        // Create random number
        int rando1 = (int) ((Math.random() * deck.size()));
        int rando2 = (int) ((Math.random() * deck.size()));
        int rando3 = (int) ((Math.random() * deck.size()));
        int rando4 = (int) ((Math.random() * deck.size()));
        int rando5 = (int) ((Math.random() * deck.size()));
        int rando6 = (int) ((Math.random() * deck.size()));
        int rando7 = (int) ((Math.random() * deck.size()));


        // draw a card from the deck
        Object card1 = deck.get(rando1);   // Pull a random card from deck
        Object card2 = deck.get(rando2);   // Pull a random card from deck
        Object card3 = deck.get(rando3);   // Pull a random card from deck
        Object card4 = deck.get(rando4);   // Pull a random card from deck
        Object card5 = deck.get(rando5);   // Pull a random card from deck
        Object card6 = deck.get(rando6);   // Pull a random card from deck
        Object card7 = deck.get(rando7);   // Pull a random card from deck


        // Display the seven random cards
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
        System.out.println(card5);
        System.out.println(card6);
        System.out.println(card7);

        // remove items from the deck
        deck.remove(rando1);
        deck.remove(rando2);
        deck.remove(rando3);
        deck.remove(rando4);
        deck.remove(rando5);
        deck.remove(rando6);
        deck.remove(rando7);

        // add card to user hand
        userHand.add(rando1);
        userHand.add(rando2);
        userHand.add(rando3);
        userHand.add(rando4);
        userHand.add(rando5);
        userHand.add(rando6);
        userHand.add(rando7);
        */


    }
    private static void Deck() {
        // Add cards to deck
        for(int i=0;i<4;i+=1){
            deck.add("Ace");
            deck.add("2");
            deck.add("3");
            deck.add("4");
            deck.add("5");
            deck.add("6");
            deck.add("7");
            deck.add("8");
            deck.add("9");
            deck.add("10");
            deck.add("Jack");
            deck.add("Queen");
            deck.add("King");
        }
    }
}
