package org.launchcode;
public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop numeric
        int nums[] = {14, 3, 12, 6, 9, 4};

        for (int i : nums) {


            System.out.println(i * i);
        }
//foreach loop string to char array
        String message = "Tony Rice was the best!";
        char[] mess = message.toCharArray();
        for (char i : mess){

            System.out.println(i + " ");
        }

        //while loop
        int l = 0;
        while (l < 10) {
            l++;
            System.out.println(l);
        }

    }
}