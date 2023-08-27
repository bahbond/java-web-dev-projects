package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
public class HashMapBandList {
    public static void main(String[] args){
        HashMap<String, String> bandMembers = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newBandMember;
        System.out.println("Enter a band member name!");

        //Get member names and instruments
        do{
            System.out.println("Member: ");
            newBandMember = input.nextLine();

            if(!newBandMember.equals("")){
                System.out.printf("Instrument: ");
                String instrument = input.nextLine();
                bandMembers.put(newBandMember, instrument);
                //reads new line before looping back
                input.nextLine();
            }
        } while(!newBandMember.equals(""));
        //print band list

        bandMembers.put("Caleb", "Mandolin");
        System.out.println(bandMembers);
        }

    }

