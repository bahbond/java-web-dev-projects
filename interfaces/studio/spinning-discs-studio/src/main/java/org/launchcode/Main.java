package org.launchcode;

public class Main {
    public static void main(String[] args) {
        // TODO: Declare and initialize a CD and a DVD object.
        DVD darkCity = new DVD("Dark City",57,1600);

        CD siameseDream = new CD("Siamese Dream", 200, 500, 12 );

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(darkCity);

        darkCity.describe();
        darkCity.playLocation();
        siameseDream.describe();
        siameseDream.playLocation();
    }
}