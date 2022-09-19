package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone first, Cone second) {
        return Double.compare(first.getCost(), second.getCost());
    }
}
