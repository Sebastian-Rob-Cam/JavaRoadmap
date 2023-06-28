package main.java.com.exercises;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("Type your word: ");
        Scanner input = new Scanner(System.in);

        String word = input.next().trim();

        char c = word.charAt(0);
        if(c >= 'a' && c <= 'z') {
            System.out.println("The first letter of \""+ word +"\" is lowercase");
        } else {
            System.out.println("The first letter of \"" + word + "\" is uppercase.");
        }
    }
}
