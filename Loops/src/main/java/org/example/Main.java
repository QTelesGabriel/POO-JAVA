package org.example;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol;

        System.out.print("Number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Symbol to use: ");
        symbol = scanner.next();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}