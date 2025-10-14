package org.example;

public class Main {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z;

        z = Math.max(x, y);
        System.out.println(z);

        z = Math.min(x, y);
        System.out.println(z);

        z = Math.abs(y);
        System.out.println(z);

        z = Math.sqrt(x);
        System.out.println(z);

        z = Math.round(x);
        System.out.println(z);

        z = Math.ceil(x);
        System.out.println(z);

        z = Math.floor(x);
        System.out.println(z);

        Hipotenusa hipotenusa = new Hipotenusa();
        hipotenusa.setSides();
        hipotenusa.calculateHypotenuse();

    }

}