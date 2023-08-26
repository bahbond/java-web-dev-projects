package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //first solution with while loop validation. Only negative number validation
       /* System.out.println("What is the radius of your circle?");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        boolean isValid = false;
        while(!isValid) {
            if (radius > 0) {
                isValid = true;
            }else{
                System.out.println("Please enter a positive number!");
                radius = input.nextDouble();
                input.close();
            }
        }
        System.out.println("The area of a circle with a radius of " + radius + " is " +area +".");
*/
        // Bonus mission 1
//        System.out.println("What is the radius of your circle?");
//
//        if (input.hasNextDouble()){
//            double radius = input.nextDouble();
//
//            if (radius > 0){
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle with radius of "+radius+" is:" +area);
//            }else{
//                System.out.println("Sorry, the radius must be a positive number.");
//            }
//        }else {
//            System.out.println("Sorry, that was not a valid number.");
//        }

        //BOnus Mission #2
        double radius;

        do {
            System.out.println("Please enter a positive number for the radius: ");

            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a number. Try again!");
               //Allows another chance to enter
                input.next();
            }
            //Stores the variable
            radius = input.nextDouble();

        } while (radius < 0);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius of "+radius+" is:" +area);

        input.close();
    }

}