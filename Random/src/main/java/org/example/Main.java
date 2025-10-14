package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(6); // Number between 0 and 5
        System.out.println(x);

        double y = random.nextDouble(); // Number between 0 and 1
        System.out.println(y);

        boolean z = random.nextBoolean(); // True or False
        System.out.println(z);

    }

}