package com.learn_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();

        DecimalFormat numberFormat = new DecimalFormat("#.##");

        System.out.println(f + "F " + numberFormat.format((5f/9f)*(f-32)) + "C");
    }
}
