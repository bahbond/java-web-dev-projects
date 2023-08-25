package org.launchcode;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures " +
                "or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a word to search for!");
        String chosenWord = input.nextLine().toLowerCase();
        System.out.println(chosenWord);
        int indexOfWord = sentence.indexOf(chosenWord);
        int lengthOfWord = chosenWord.length();

        if(sentence.toLowerCase().contains(chosenWord)) {
            System.out.println("True");
            System.out.println("Your search term first appears at index " + indexOfWord + " and is " +lengthOfWord+ " characters long.");
            String modifiedSentence = sentence.replace(chosenWord, "");
            System.out.println(modifiedSentence);
        }

        else{
            System.out.println("False");
            }
        }
    }
