package com.learn_java;

public class Buchstaben {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }

        System.out.println();

        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter);
            letter++;
        }
    }
}
