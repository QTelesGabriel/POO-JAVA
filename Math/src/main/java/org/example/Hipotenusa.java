package org.example;

import java.util.Scanner;

public class Hipotenusa {

    private double x;
    private double y;

    public void setSides() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scan.nextDouble();
        System.out.println("Enter side y: ");
        y = scan.nextDouble();

        scan.close();

    }

    public double calculateHypotenuse() {

        double z = Math.sqrt((x * x) + (y * y));
        System.out.println("A hipotenusa vale: " + z);

        return z;

    }

}
