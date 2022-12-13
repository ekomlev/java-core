package com.eduard.comparator;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //Comparable
        System.out.println("Comparable\n");

        //By default, compares by area as we implemented such logic in House class
        TreeSet<House> houses = new TreeSet<>();

        var houseTo = new House("Tokyo", 120000, 50);
        var houseOx = new House("Oxford", 70000, 90);
        var housePa = new House("Paris", 180000, 40);

        houses.add(houseTo);
        houses.add(houseOx);
        houses.add(housePa);

        for (House h: houses) {
            System.out.println(h);
        }
        System.out.println("\n\n");

        //Comparator
        System.out.println("Comparator\n");

        ArrayList<House> houses2 = new ArrayList<>();

        var houseSa = new House("San Andreas", 1300000, 50);
        var houseLa = new House("Los Angeles", 2000000, 90);
        var houseNy = new House("NY", 1600000, 40);

        houses2.add(houseSa);
        houses2.add(houseLa);
        houses2.add(houseNy);

        for (House h: houses2) {
            System.out.println(h);
        }

        var priceComparator = new PriceComparator();
        houses2.sort(priceComparator);

        System.out.println("\nSorted: ");
        for (House h: houses2) {
            System.out.println(h);
        }


    }
}
