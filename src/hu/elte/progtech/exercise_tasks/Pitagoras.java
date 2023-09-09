package hu.elte.progtech.exercise_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Pitagoras {

    public static void main(String[] args) throws IOException {
        if (solutionWithBufferedReader()) {
            System.out.println("Pitagoras numbers!");
        } else {
            System.out.println("Not Pitagoras numbers! :(");
        }
    }

    public static boolean solutionWithScanner() {
        byte inputIndex = 0; // használhatunk int típust is, de mivel csak a sikeres inputokat számoljuk a változóban ezért bőven elég a byte típus is
        System.out.println("Type 3 numbers and let the program decide the given numbers are Pitagoras numbers:");
        int[] numbers = new int[3];
        while (inputIndex < 3) {
            System.out.print(inputIndex+1 + ".number:");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            try {
                int parsedNumber = Integer.parseInt(line);
                numbers[inputIndex] = parsedNumber;
                inputIndex++;
                System.out.println();
            } catch (NumberFormatException e) {
                System.err.println("Wrong number format! Try again!");
            }
        }
        /*
         * Mielőtt az algoritmust kitalálnánk, gondoljuk végig a Pitagorasz-tételt. A két befogó (ami a két kisebb oldal) négyzetének összege = az átfogó négyzetével (leghoszabb oldal).
         * Ha rendezzük a tömbböt, akkor megkapjuk a befogókat és az átfogót. Utánna már csak alkalmazzuk a tételt.
         */
        Arrays.sort(numbers);
        return ((numbers[0] * numbers[0]) + (numbers[1] * numbers[1])) == (numbers[2] * numbers[2]);
    }

    public static boolean solutionWithBufferedReader() throws IOException {
        byte inputIndex = 0;
        System.out.println("Type 3 numbers and let the program decide the given numbers are Pitagoras numbers:");
        int[] numbers = new int[3];
        while (inputIndex < 3) {
            System.out.print(inputIndex+1 + ".number:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            try {
                int parsedNumber = Integer.parseInt(line);
                numbers[inputIndex] = parsedNumber;
                inputIndex++;
                System.out.println();
            } catch (NumberFormatException e) {
                System.err.println("Wrong number format! Try again!");
            }
        }
        /*
         * Mielőtt az algoritmust kitalálnánk, gondoljuk végig a Pitagorasz-tételt. A két befogó (ami a két kisebb oldal) négyzetének összege = az átfogó négyzetével (leghoszabb oldal).
         * Ha rendezzük a tömbböt, akkor megkapjuk a befogókat és az átfogót. Utánna már csak alkalmazzuk a tételt.
         */
        Arrays.sort(numbers);
        return ((numbers[0] * numbers[0]) + (numbers[1] * numbers[1])) == (numbers[2] * numbers[2]);
    }
}
