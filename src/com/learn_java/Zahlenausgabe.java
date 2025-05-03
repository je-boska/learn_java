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

        int i = 1;
        while (i <= 100) {
            if (i < 10) System.out.print("    ");
            if (i >= 10 && i < 100) System.out.print("   ");
            if (i == 100)  System.out.print("  ");
            System.out.print(i);
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }

        int j = 1;
        do {
            if (j < 10) System.out.print("    ");
            if (j >= 10 && j < 100) System.out.print("   ");
            if (j == 100)  System.out.print("  ");
            System.out.print(j);
            if (j % 10 == 0) {
                System.out.println();
            }
            j++;
        } while (j <=100);
    }
}
