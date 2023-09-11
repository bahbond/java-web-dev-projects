package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate   ;

public class Menu {
private ArrayList<MenuItem> menuItems = new ArrayList<>();
private LocalDate lastUpdated;

//Allow for default constructor


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    //TODO: Define custom toString() method
    //List menu items, grouped by category
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        } StringBuilder mainCourses = new StringBuilder();
            for (MenuItem item : menuItems) {
                if(item.getCategory().equals("Main Course")){
                    mainCourses.append("\n").append(item.toString()).append("\n");
                }
            } StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if(item.getCategory().equals("Dessert")){
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nAndy's Place\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }
//TODO: Define addItem()
    // Make sure to update lastUpdated anytime something is succesfefully added
    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }
//TODO: Define removeItem()
    void removeItem(MenuItem item){
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}
