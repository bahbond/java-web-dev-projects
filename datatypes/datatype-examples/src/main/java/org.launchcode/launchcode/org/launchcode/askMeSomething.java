package org.launchcode;
import java.util.Scanner;
public class askMeSomething {
    public static void main(String[] args){

        String response;
        Scanner hobby = new Scanner(System.in);
        System.out.println("What is one of your favorite hobbies?");
        response = hobby.nextLine();
        System.out.println("That's wonderful! I think " + response + " is a great way to pass the time!");
        Scanner timeSpent = new Scanner(System.in);
        System.out.println("How many hours a week do you get to spend time with your hobby?");
        int time = timeSpent.nextInt();
        if (time > 10){
            System.out.println(time + " hours!! That's incredible!");
        }else {
            System.out.println(time + " hours!! If only there were more hours in the day!");
        }
    }
}
