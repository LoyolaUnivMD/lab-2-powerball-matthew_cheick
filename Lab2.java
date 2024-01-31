// Programmers: Matthew Woodside and Cheick Ly
// Course: CS212, Mr John
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement:
// Data In: Name of player
// Data Out: Prize, random lottery numbers, instructions
// Credits: Based on in class example

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        System.out.println("CS 212 - Lab 2");
        System.out.println("Welcome to CS212 live betting, the only program where students under 21 operate the lottery system. This game will allow you to receive 10 lottery tickets and, ultimately, see the prize pool. Good luck, and if you have a gambling problem seek professional help!");
        System.out.println("What's your name? ");
        String player = input.nextLine();
        System.out.println("Here are the tickets: ");
        Random number = new Random();
        DecimalFormat fmt = new DecimalFormat("#00");
        int i = 0;
        while (i < 10) {
            System.out.println(fmt.format(number.nextInt(99)) + " " + fmt.format(number.nextInt(99)) + " " +fmt.format(number.nextInt(99)) + " " +fmt.format(number.nextInt(99)) + " " +fmt.format(number.nextInt(99)) + " " +fmt.format(number.nextInt(99)));
            i ++;
            }
// Print out the seperators
        System.out.println("------------------");
// Print out a goodluck messages with the players name
        System.out.println("Good luck " + player.strip() + "!");
// Print out the estimated jackpots
        System.out.println("Estimated Jackpot: ");
// Set up a new decimal format to add commas print out prize amount
        DecimalFormat form = new DecimalFormat("#000,000,000");
        System.out.println("$" + form.format(prize));
        System.out.println("------------------");
        }

    }
