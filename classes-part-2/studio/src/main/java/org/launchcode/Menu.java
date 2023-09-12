package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : items)
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        StringBuilder MainCourse = new StringBuilder();
        for (MenuItem item : items)
            if (item.getCategory().equals("appetizer")) {
                MainCourse.append("\n").append(item.toString()).append("\n");
            }
        StringBuilder Desserts = new StringBuilder();
        for (MenuItem item : items)
            if (item.getCategory().equals("dessert")) {
               Desserts.append("\n").append(item.toString()).append("\n");
            }
        return "\nRoy's Place\n" +
                "Appetizers" + appetizers.toString() +"\n"+
                "Main Courses" + MainCourse.toString() + "\n"+
                "Desserts" + Desserts.toString() + "\n ---------------------";
        }
//TODO: Define add item
void addItem(MenuItem newItem){
       items.add(newItem);
        lastUpdated = LocalDate.now();
}

    //TODO: Define remove item
    }



