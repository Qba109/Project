package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        // Task 1
        // * Take to integers (a, b)
        // * divide them by each other
        // * return as double
        //
        // i.e.
        //  input: 1, 2
        //  output: 0.5
        //

        System.out.print("Wpisz imie: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();

        System.out.println("Mam na imie: " + line);
    }
}