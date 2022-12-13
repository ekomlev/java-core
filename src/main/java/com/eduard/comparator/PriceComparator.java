package com.eduard.comparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {

    @Override
    public int compare(House h1, House h2) {
        return Integer.compare(h1.price, h2.price);
    }
}
