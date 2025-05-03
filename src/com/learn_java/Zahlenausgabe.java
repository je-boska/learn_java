package com.learn_java;

public class Zahlenausgabe {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i < 10) System.out.print("    ");
            if (i >= 10 && i < 100) System.out.print("   ");
            if (i == 100)  System.out.print("  ");
            System.out.print(i);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
