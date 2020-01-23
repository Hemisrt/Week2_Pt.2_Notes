package com.company.Greenlee;

import java.util.Scanner;
import java.lang.String;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i += 2;
        }

        for (i = 0; i < 10;) {
            System.out.println(i);
            i += 2;
        }

        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i < 10);

        int[] integers = {1, 2, 3, 4, -1, -2, 10};
        for (i = 0; i < integers.length; i++) {
            if (integers[i] < 0) {
                System.out.println("Negative found: " + integers[i]);
            }
        }

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        String word = input.nextLine();
        String charDel = word.substring(1, word.length() - 1);
        System.out.println(charDel);
    }
}
