package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Wpisz imie: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();

        System.out.println("Mam na imie: " + line);
    }
}