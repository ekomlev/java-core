package com.eduard.comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class House implements Comparable<House> {
    String city;
    int price;
    int area;

    @Override
    public String toString() {
        return "House{" +
                "city=" + city +
                ", price=" + price +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(House anotherHouse) {
        return Integer.compare(this.area, anotherHouse.area);
    }
}
