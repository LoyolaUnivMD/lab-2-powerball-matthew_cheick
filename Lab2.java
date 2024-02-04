// Programmer(s): Matthew Woodside and Cheick Ly
// Course: CS212, Mr John
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement:
// Data In: Name of player
// Data Out: Prize, random lottery numbers, instructions
// Credits: Based on in class example

// Imports the Scanner, Random, and Decimal utilities
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {

// Sets up the scanner utility with the key word 'input'
        Scanner input = new Scanner(System.in);
        System.out.println("CS 212 - Lab 2");

// Outputs purpose of the program
        System.out.println("Welcome to CS212 live betting, the only program where students under 21 operate the lottery system. This game will allow you to receive 10 lottery tickets and, ultimately, see the prize pool. Good luck, and if you have a gambling problem seek professional help!");

// Asks and store user's name
        System.out.println("What's your name? ");
        String player = input.nextLine();

// Asks and store user's bet
        System.out.println("How much would you like to bet? ");
        double bet = input.nextDouble();

// Outputs name and bet amount
        System.out.println("Great! " + player + " wants to bet " + bet);

// Outputs an expression telling the users what's to come
        System.out.println("Here are the tickets: ");
        System.out.println("------------------");

// Sets up the random and decimal format utility
        Random number = new Random();
        DecimalFormat fmt = new DecimalFormat("#00");

// Initializes the variables to be used in the loop
        int i = 0;
        double prize = bet;

// While loop which prints out all the random numbers
        while (i < 10) {

// Initializes the variables to be used in the nested while loop
            int j = 0;
            int rand1 = 0;
            int rand2 = 0;
            int rand3 = 0;
            int rand4 = 0;
            int rand5 = 0;
            int rand6 = 0;

// While loop which sets the random numbers and checks if they are lucky
            while (j < 6) {

// Sets the random number and checks if it equals one of the chosen winning numbers
                int rand = number.nextInt(99);
                if (rand == 3 || rand == 5 || rand == 16 || rand == 58 || rand == 59 || rand == 11) {
                    prize = java.lang.Math.pow(prize, 1.75);
                }
                j ++;

// If-statement which sets the six random variables to be printed out
                if (j == 1) {
                    rand1 = rand;
                } else if (j == 2) {
                    rand2 = rand;
                } else if (j == 3) {
                    rand3 = rand;
                } else if (j == 4) {
                    rand4 = rand;
                } else if (j == 5) {
                    rand5 = rand;
                } else {
                    rand6 = rand;
                }
            }
            System.out.println(fmt.format(rand1) + " " + fmt.format(rand2) + " " +fmt.format(rand3) + " " +fmt.format(rand4) + " " +fmt.format(rand5) + " " +fmt.format(rand6));
            i ++;
        }

// Print out the separators
        System.out.println("------------------");

// Print out a good luck messages with the players name
        System.out.println("Good luck " + player.strip() + "!");

// Print out the separators
        System.out.println("------------------");

// Print out the estimated jackpots
        System.out.println("Your Winnings Are: ");

// Set up a new decimal format to add commas print out prize amount
        DecimalFormat form = new DecimalFormat("#0.00");
        System.out.println("$" + form.format(prize));
        System.out.println("------------------");
    }

}
