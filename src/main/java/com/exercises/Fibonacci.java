package main.java.com.exercises;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int number) {
        if(number <= 1)
            return number;
        else
            return fibonacci(number - 1) +
                    fibonacci(number - 2);
    }

}
