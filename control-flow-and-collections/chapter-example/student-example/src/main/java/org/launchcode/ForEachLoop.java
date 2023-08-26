package org.launchcode;
import java.util.StringJoiner;
public class ForEachLoop {
    public static void main(String[] args) {
        int nums[] = {14, 3, 12, 6, 9, 4};

        for (int i : nums) {


            System.out.println(i * i);
        }

        String message = "Tony Rice was the best!";
        char[] mess = message.toCharArray();
        for (char i : mess){

            System.out.println(i + " ");
        }

    }
}