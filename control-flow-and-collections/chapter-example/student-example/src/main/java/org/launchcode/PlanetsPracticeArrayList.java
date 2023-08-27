package org.launchcode;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlanetsPracticeArrayList {
    public static void main(String[] args){
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");

        System.out.println(planets.contains("Venus"));
        System.out.println(planets.indexOf("Mercury"));
   //sort in alphabetical order
    Collections.sort(planets);
        System.out.println(planets);

        ArrayList<String> charStars = new ArrayList<>();
        charStars.add("a");
        charStars.add("b");
        charStars.add("c");
        System.out.println(charStars);


    }
}
