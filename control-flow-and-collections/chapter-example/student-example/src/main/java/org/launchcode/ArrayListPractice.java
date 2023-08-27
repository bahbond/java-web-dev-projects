package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main (String[] args){
        ArrayList<String> guitars = new ArrayList<>();
        ArrayList<Double> year = new ArrayList<>();
        Scanner input = new Scanner(System.in);
       String newGuitars;
        System.out.println("What kind of instrument?");
        //get guitar names
        do {
            newGuitars = input.nextLine();

            if (!newGuitars.equals("")) {
                guitars.add(newGuitars);
            }
        }while(!newGuitars.equals(""));

        //get guitar years
        for (String guitar : guitars){
            System.out.println("Year for " + guitar + ": ");
            Double modelYear = input.nextDouble();
            year.add(modelYear);
      }
        //print guitar list with years
        System.out.println("/nInstrument List:");
        double sum = 0.0;

        for (int i=0; i < guitars.size();i++){
            System.out.println((guitars.get(i) + " (" + year.get(i) +")"));
        sum += year.get(i);
        }
        }

    }


