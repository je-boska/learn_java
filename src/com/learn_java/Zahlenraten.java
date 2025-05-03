package com.learn_java;
import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game");
        Random r = new Random();
        int num = r.nextInt(0, 20);
        System.out.println(num);

        Scanner sc = new Scanner(System.in);
        boolean guessed = false;
        int attempts = 1;
        while (!guessed) {
            System.out.println("Attempt #" + attempts + ": ");
            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("You guessed correctly in " + attempts + " attempts.");
                guessed = true;
                break;
            }
            else {
                if (guess < num) {
                    System.out.println("Guess was too low.");
                }
                if (guess > num) {
                    System.out.println("Guess was too high.");
                }
            }
            attempts++;
        }
    }
}
