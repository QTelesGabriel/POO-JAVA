package org.example;

public class Main {
    public static void main(String[] args) {

        // Arrays
        String[] cars = {"BMW", "Volvo", "Mercedes"};
        for(int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + ", ");
        }

        System.out.println();

        String[] nomes = new String[3];
        nomes[0] = "Gabriel";
        nomes[1] = "Eduardo";
        nomes[2] = "Samuel";
        for(int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + ", ");
        }

        // 2d Arrays
        String[][] cars2 = new String[3][3];
        cars2[0][0] = "Camaro";
        cars2[0][1] = "Corvette";
        cars2[0][2] = "Silverado";
        cars2[1][0] = "Mustang";
        cars2[1][1] = "Ranger";
        cars2[1][2] = "F-150";
        cars2[2][0] = "Ferrari";
        cars2[2][1] = "Lambo";
        cars2[2][2] = "Tesla";
        for(int i = 0; i < cars2.length; i++) {
            System.out.println();
            for(int j = 0; j < cars2[i].length; j++) {
                System.out.print(cars2[i][j] + " ");
            }
        }

        String[][] cars3 = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
        for(int i = 0; i < cars3.length; i++) {
            System.out.println();
            for(int j = 0; j < cars3[i].length; j++) {
                System.out.print(cars3[i][j] + " ");
            }
        }


    }
}