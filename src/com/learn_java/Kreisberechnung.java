package com.learn_java;

import java.util.Scanner;

public class Kreisberechnung {
    public static void main(String[] args) {
        double PI = 3.14159265358979323846;

        Scanner sc = new Scanner(System.in);
        System.out.println("Kreisberechnung:");
        System.out.println("================");

        double r = sc.nextDouble();

        System.out.println("Radius eingeben: " + r);
        System.out.println("Der Kreisumfang mit dem Radius " + r + "beträgt: " + (2d * PI *r));
        System.out.println("Der Kreisfläche mit dem Radius " + r + "beträgt: " + (PI * r * r));
    }
}
