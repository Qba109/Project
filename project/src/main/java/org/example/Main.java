package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Wpisz imie: ");
        String line = new Scanner(System.in).next();

        System.out.println("Mam na imie: " + line);
    }
}