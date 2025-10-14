package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList = resizable array
        //             Elements can be added and removed after compilation phase
        //             Store reference data type

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburguer");
        food.add("hotdog");
        printList(food);

        food.set(0, "sushi");
        printList(food);

        food.remove(2);
        printList(food);

        food.clear();
        printList(food);

    }

    public static void printList(ArrayList<String> food) {
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println();
    }

}