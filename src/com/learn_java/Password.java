package com.learn_java;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        int pw = 5566;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int pwInput = sc.nextInt();
            if (pwInput == pw) {
                System.out.println("WELCOME");
            }
            else {
                System.out.println("WRONG PASSWORD");
            }
        }
        else {
            System.out.println("ERROR");
        }
    }
}
