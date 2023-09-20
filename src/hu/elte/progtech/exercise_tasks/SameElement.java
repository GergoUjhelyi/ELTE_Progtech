package hu.elte.progtech.exercise_tasks;

import java.util.Arrays;
import java.util.Random;

public class SameElement {

    public static final int ARRAY_SMALL_LENGTH = 15;
    public static final int ARRAY_LONG_LENGTH = 50;
    public static void main(String[] args) {
        //int[] array = randomArrayWithRandom(25);
        //int[] array = { 1, 2 ,3};
        int[] array = randomArrayWithMath(25);
        boolean sameElement = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    sameElement = true;
                    break;
                }
            }
        }
        System.out.println(sameElement ? "We have same number in the array" : "We don't have same number");
    }

    public static int[] randomArrayWithRandom(int upperBound) {
        Random random = new Random();
        int[] randomArray = new int[ARRAY_SMALL_LENGTH];

        for (int i = 0; i < ARRAY_SMALL_LENGTH; i++) {
            randomArray[i] = random.nextInt(upperBound) + 1; // 1-upperBound
        }
        System.out.println("Random integer numbers with Random class:" + Arrays.toString(randomArray));
        return randomArray;
    }

    public static int[] randomArrayWithMath(int upperBound) {
        int[] randomArray = new int[ARRAY_SMALL_LENGTH];

        for (int i = 0; i < ARRAY_SMALL_LENGTH; i++) {
            randomArray[i] = (int)Math.floor(Math.random() * (upperBound) + 1); // 1-upperBound
        }
        System.out.println("Random integer numbers with Math.random:" + Arrays.toString(randomArray));
        return randomArray;
    }
}
