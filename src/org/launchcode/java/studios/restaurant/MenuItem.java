package org.launchcode.java.studios.restaurant;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String desc;
    private String category;
    private Boolean isNew;

    public MenuItem(String name, double price, String desc, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.isNew = isNew;

        String item = category.toLowerCase();
        if (item.equals("appetizer") || item.equals("main course") || item.equals("dessert")) {
            this.category = category;
        } else {
            throw new IllegalArgumentException("Not a category. Please enter appetizer, dessert, or main course.");
        }
    }

    public String toString() {
        if (isNew) {
            return "MenuItem:" +
                    "\n\t" + category + ": " + name +
                    "\n\t$" + price +
                    " NEW ITEM!\n";
        } else {
            return "MenuItem:" +
                    "\n\t" + category + ": " + name +
                    "\n\t$" + price + "\n";
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && name.equals(menuItem.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setDesc(String aDesc) {
        this.desc = aDesc;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setIsNew(Boolean aNew) {
        this.isNew = aNew;
    }
}
