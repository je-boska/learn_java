package com.learn_java;

public class ErsteVersuche {
    public static void main(String[] args) {
        long alpha = 20000000000L;
        long beta = 4L;
        System.out.print("Die Summe von " + alpha + " + " + beta + " ergibt: ");
        System.out.println(alpha+beta);

        System.out.print("Die Summe von " + alpha + " - " + beta + " ergibt: ");
        System.out.println(alpha-beta);

        System.out.print("Die Summe von " + alpha + " * " + beta + " ergibt: ");
        System.out.println(alpha*beta);

        System.out.print("Die Summe von " + alpha + " / " + beta + " ergibt: ");
        System.out.println(alpha/beta);

        System.out.print("Die Summe von " + alpha + " % " + beta + " ergibt: ");
        System.out.println(alpha%beta);
    }
}
