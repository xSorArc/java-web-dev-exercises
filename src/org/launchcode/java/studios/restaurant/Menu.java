package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Menu {
    /*    1) The menu consists of several menu items.
          2) Each menu item has a price, description, and category (appetizer, main course, or dessert).
          3) It should be possible to display whether a menu item is new or not.
          4) The app should know when the menu was last updated, so visitors can see that the restaurant
             is constantly changing and adding exciting new items.

          Required Instance Methods:
          5) A way to add and remove menu items from the menu.
          6) A way to tell if a menu item is new.
          7) A way to tell when the menu was last updated.
          8) A way to print out both a single menu item or the entire menu.
          9) A way to determine whether two menu items are equal.
             List the method names and access levels, along with the types of all input and return parameters.
             Also, consider whether any methods should be static.

          5 - addItem(), removeItem() or updateMenu() Access level: private? Type: Object(MenuItem)
          6 - isNewItem(), Access level: public? Takes an object(MenuItem) param and returns a boolean.
          7 -
          8 - printItem(), printMenu() Access leveL: public? Type: Takes an object(MenuItem) param and returns String.
          9 - override equals() to determine equality. What makes the items equal?

     ***  7 - Instead of a method we could just have the "Menu last updated: (date)" at the bottom of menu or change
              the menu every day. In that case we would have "Menu updated daily" at bottom of menu.

          Menu class:
            main method

          MenuItem class:
            Properties - protected?(double)Price, private?(String)Desc, public?(String)Category,
                         private?(boolean)isNew "use date class?"

            Instance Methods go here?

            *** Don't forget getters & setters ***

            ---Studio Ideas:---
            HashMaps <category names, Array<MenuItems>> pushed to an ArrayList with a method to sort each MenuItem
        */
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

    ArrayList<MenuItem> ourMenu = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        ourMenu.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        ourMenu.remove(item);
    }

    public boolean isNew(MenuItem item) {
        boolean decision = false;
        if (item.getDateMade().after(lastUpdated)) {
            decision = true;
        }
        return decision;
    }

    // add getLastUpdated()

    public void displayMenuItems() {
        for (MenuItem item : this.ourMenu) {
            System.out.println(item.getName() + item.getCategory() + item.getDesc() + item.getPrice());
        }
    }

    public void displayItem(String aName) {
        for (MenuItem item : this.ourMenu) {
            if (item.getName().equals(aName)) {
                System.out.println(item.getName() + item.getCategory() + item.getDesc() + item.getPrice());
            }
        }
    }

    public static void main(String[] args) {
        Date today = new Date();

        MenuItem toastedRavs = new MenuItem("Toasted Ravioli", 9.99, "Beef inside a tasty fried shell", "appetizer", false);
        MenuItem friedPickleChips = new MenuItem("Fried Pickle Chips", 9.99, "Deep fried slices of pickles", "appetizer", true);
        MenuItem chickenAlfredo = new MenuItem("Chicken Alfredo", 12.99, "Pasta with chicken and alfredo sauce", "main course", false);
        MenuItem chickenSalad = new MenuItem("Chicken Salad", 11.99, "Hearty salad with chicken and your choice of dressing", "main course", false);
        MenuItem soupAndSalad = new MenuItem("Soup and Salad", 12.99, "Your choice of soup and salad", "main course", false);
        MenuItem gooeyButterCake = new MenuItem("Gooey Butter Cake", 9.99, "Delicious StL style butter cake", "dessert", false);
        MenuItem oreoTiramisu = new MenuItem("Oreo Tiramisu", 9.99, "Yummy oreos in tiramisu form", "dessert", true);

        Collections.addAll(ourMenu, toastedRavs, friedPickleChips, chickenAlfredo, chickenSalad,
                soupAndSalad, gooeyButterCake, oreoTiramisu);

        System.out.println(ourMenu);
        System.out.println("\nMenu last updated: " + today);
    }
}
