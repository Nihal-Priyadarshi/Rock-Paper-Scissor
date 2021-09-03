package com.company;

import java.util.Random;
import java.util.Scanner;

public class gameRockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissor Game!\nYou will get five chances, show your skills.");
        int n=0;
        byte a=0, b=0;

        while (n<5){
            System.out.println("Choose any from below:-\n\t0 for Rock\n\t1 for Paper\n\t2 for Scissor");

            Scanner sc = new Scanner(System.in);
            Random ra = new Random();

            System.out.print("It's your turn: ");
            int user_input = sc.nextInt();
            switch (user_input) {
                case 0 -> System.out.println("You selected Rock.");
                case 1 -> System.out.println("You selected Paper.");
                case 2 -> System.out.println("You selected Scissor.");
            }

            System.out.print("It's computer's turn: ");
            int computer_input = ra.nextInt(3);
            System.out.println(computer_input);
            switch (computer_input) {
                case 0 -> System.out.println("Computer selected Rock.");
                case 1 -> System.out.println("Computer selected Paper.");
                case 2 -> System.out.println("Computer selected Scissor.");
            }

            if ((user_input == 0 && computer_input == 2) || (user_input == 1 && computer_input == 0) || (user_input == 2 && computer_input == 1)) {
                a++;
            }
            else if ((user_input == 0 && computer_input == 1) || (user_input == 1 && computer_input == 2) || (user_input == 2 && computer_input == 0)) {
                b++;
            }

            System.out.println("Your Points : Computer's Points = " + a + " : " + b);
            if (n<4){
                System.out.println("\n");
            }
            n++;
        }

        if (a>b){
            System.out.println("Congratulations, You Won This Match!");
        }
        else if (a<b){
            System.out.println("You Lose! Better luck next time.");
        }
        else {
            System.out.println("Match Draw");
        }
    }
}
