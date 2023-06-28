package main.java.com.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // amount of numbers
        System.out.print("How many numbers want use? ~ ");
        int amountOfNumbers = scanner.nextInt();

        List<Integer> listOfNumber = new ArrayList<>();

        for(int i = 1; i <= amountOfNumbers; i++) {
            int numberRandom = (int)((Math.random() * 10) * (Math.random() * amountOfNumbers));
            System.out.println("Number N" + i + ": " + numberRandom);
            listOfNumber.add(numberRandom);
        }

        // Q: Find the largest of the 3 numbers
        int largestNumber = 0;

        for(int i = 0; i < listOfNumber.size(); i++) {
            if(listOfNumber.get(i) > largestNumber) {
                largestNumber = listOfNumber.get(i);
            }
        }

        System.out.println("This is the largest number: " + largestNumber);

    }

}
