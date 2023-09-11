package org.launchcode;

public class RestaurantMain {

    public static void main(String[] args) {
MenuItem item1 = new MenuItem("Cheeseburger", "Angus Beef, PepperJack Cheese", 12.00, "Main Course");
        MenuItem item2 = new MenuItem("Chicken Sandwich", "Lightly Battered, Bacon, Lettuce and Tomato", 10.00, "Main Course");
        MenuItem item3 = new MenuItem("Garlic Fries", "Flash Fried, 24 Hour Method", 8.00, "Appetizer");
        MenuItem item4 = new MenuItem("Chocolate Cake", "Ganache, 2 tier", 12.00, "Dessert");
        MenuItem item5 = new MenuItem("Brussel Sprouts", "Roasted, Bacon, and Garlic", 8.00, "Appetizer");

        System.out.println(item1.isNew());

        //TODO Print first item

        System.out.println(item1);

        //TODO: Create menu
        Menu menu = new Menu();

        //TODO: Add items to menu
        // and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        System.out.println(menu);

            //TODO Test Equals Method
            System.out.println(item1.equals(item2));

            MenuItem item6 = new MenuItem("Garlic Fries", "Flash Fried, 24 Hour Method", 8.00, "Appetizer");
            System.out.println(item3.equals(item6));
    }
}
