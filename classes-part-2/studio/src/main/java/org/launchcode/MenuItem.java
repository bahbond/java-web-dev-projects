package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private final LocalDate dateAdded;



    public MenuItem(String name, double price, String description, String category, boolean iN) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = iN;
        this.dateAdded = LocalDate.now();
    }

   public void setName(String name){
        this.name = name;
   }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public LocalDate getDateAdded(){
        return dateAdded;
    }


    //TODO: Define instance method isNew
    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
    //TODO: String Method
    @Override
    public String toString(){
String newText = isNew() ? " - NEW!" : "";
        return name + newText +"\n" +
                description + "| $" + price;
    }
}

