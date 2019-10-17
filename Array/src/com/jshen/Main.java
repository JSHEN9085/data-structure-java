package com.jshen;

public class Main {

    public static void main(String[] args) {
        System.out.println("Create a bland array of size 10");
        SingleDimensionArray sda = new SingleDimensionArray(10);

        System.out.println("Printing array");
        sda.TraverseArray();
        System.out.println();
        System.out.println();

        System.out.println("Inserting few values in the array");
        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(3, 30);
        sda.insert(4, 40);
        sda.insert(5, 50);
        sda.insert(6, 60);
        sda.insert(7, 70);
        sda.insert(8, 80);
        sda.insert(1, 100);
        sda.insert(12, 120); //this will come out error as array length is 10
        System.out.println();
        System.out.println();

        System.out.println("Accessing cell ");
        sda.accessingCell(1);
        System.out.println();
        System.out.println();

        System.out.println("Searching 30");
        sda.search(30);
        System.out.println();
        System.out.println();

        System.out.println("Searching 400");
        sda.search(400);
        System.out.println();
        System.out.println();
    }
}
