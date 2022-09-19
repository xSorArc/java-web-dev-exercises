package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

//    @Override                     // Sort by name.
//    public int compare(Flavor first, Flavor second) {
//        return first.getName().compareTo(second.getName());
//    }

    @Override                       // Sort by allergen (H to L)
    public int compare(Flavor first, Flavor second) {
        return Integer.compare(0, first.getAllergens().size() - second.getAllergens().size());
    }
}
