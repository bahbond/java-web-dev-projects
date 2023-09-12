package org.launchcode;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem item1 = new MenuItem("Burger",14 , "Cheeseburger","Main Course", true);
        MenuItem item2 = new MenuItem("Pizza", 12, "Pepperoni", "Main Course", true);

        MenuItem item3 = new MenuItem("French Fries", 8, "Garlic Fries", "Appetizer", true );
        MenuItem item4 = new MenuItem("Chocolate Cake", 10, "German Chocolate", "Dessert", true );


        System.out.println(item1);
    }
}
