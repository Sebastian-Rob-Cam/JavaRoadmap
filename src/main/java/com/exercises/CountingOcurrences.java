package main.java.com.exercises;

import java.util.*;

public class CountingOcurrences {
    public static void main(String[] args) {
        System.out.print("Insert your number: ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            characterList.add(n.charAt(i));
        }

        Collections.sort(characterList, Collections.reverseOrder());

        Character result = 0;
        int counter = 0;
        int counterForActualNumber = 0;

        for (int i = 0; i < characterList.size(); i++) {
            // number that we will use to count how many times it appears
            Character characterForEvaluate = characterList.get(i);
            counterForActualNumber = 0;

            // traversing the array again to count the number of times the number is repeated
            for(int i1 = 0; i1 < characterList.size(); i1++) {
                // if appears the number add one to counter
                if(characterForEvaluate == characterList.get(i1))
                    counterForActualNumber++;
            }

            if (counterForActualNumber > counter) {
                counter = counterForActualNumber;
                result = characterForEvaluate;
            }
            else result = result;
        }

        System.out.println(result + " this is the most repetitive number.");
    }

}
