package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] listOfStrings = {34, 55, 77, 5, 5};


        System.out.println("====================================== ");

        Arrays.stream(listOfStrings).forEach(s -> System.out.print(s + " "));
        System.out.println("  ");

        System.out.println("======================================");

        System.out.println("Tablica po zamianie indeksu [1] i [2]:  ");

        System.out.println("======================================  ");

        int zmienna = listOfStrings[1];

        listOfStrings[1] = listOfStrings[2];
        listOfStrings[2] = zmienna;

        for (int element : listOfStrings) {
            System.out.print(element + " ");
        }


        // ZADANIE 2

        System.out.println("  ");
        System.out.println("  ");
        LinkedList m = new LinkedList();
        for (int i = 0; i < 10; i++) {

            Random random = new Random();

            m.add(random.nextInt(100));

            System.out.println(m);
        }


    }
}