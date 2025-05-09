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

        int delta = -2147483648;
        System.out.println(delta - 1);

        boolean a, b, c;
        a = 10 < 5;
        b = 11 < 3;
        c = 20 == (10 * 2);

        System.out.println(!a && (b || c));

        int x = 0;
        int y = 0;

        x = y = 3;

        System.out.println(x);
        System.out.println(y);

        double erg = 0.6;
        double mult = 6*0.1;
        boolean gleich = erg == mult;
        boolean groesser = mult > erg;

        System.out.println(gleich);
        System.out.println(groesser);

        double mini = 0.001;
        double gross = 999999999;
        double erg2 = gross + mini - gross;
        System.out.println(erg2 == mini);
        System.out.println(erg2);

        char one = '\u0061';
        System.out.println(one);

        String test = "-28" + 2;
        System.out.println(test);
    }
}
