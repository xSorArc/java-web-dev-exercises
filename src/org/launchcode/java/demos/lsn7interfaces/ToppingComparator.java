package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {

    @Override
    public int compare(Topping first, Topping second) {
        return first.getName().compareTo(second.getName());
    }
}
