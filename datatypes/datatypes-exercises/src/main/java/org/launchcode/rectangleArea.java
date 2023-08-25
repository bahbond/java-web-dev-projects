package org.launchcode;
import java.util.Scanner;
public class rectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double rectLength = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        Double rectWidth = input.nextDouble();
        Double rectArea = rectWidth * rectLength;
        System.out.println("The area of your rectangle is "+ rectArea);
    }
}
