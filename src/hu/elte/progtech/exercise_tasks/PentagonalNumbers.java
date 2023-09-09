package hu.elte.progtech.exercise_tasks;

import java.util.Arrays;

/**
 * Az ötszögszámok a figurális számokon belül a sokszögszámok közé tartoznak. Az n-edik ötszögszám pn a közös csúcsból rajzolt, legfeljebb n pont oldalhosszúságú szabályos ötszögök körvonalai egymástól különböző pontjainak száma.
 */
public class PentagonalNumbers {

    public static final int NUMBERS_COUNT = 30;
    public static void main(String[] args) {
        int[] pentagonalNumbers = new int[NUMBERS_COUNT];

        for (int i = 0; i < NUMBERS_COUNT; i++) {
            int j = i + 1; // A j változót fogjuk használni mert a matematikai képletet [1..30] között értelmezzük, nem [0..29] között.
            int n_number = ((3 * (j * j)) - j) / 2; // Teljesen zárójelezett alak: nem szükséges mindenhol de a kód jobban olvasható lesz tőle.
            pentagonalNumbers[i] = n_number;
        }
        System.out.println(Arrays.toString(pentagonalNumbers)); // != System.out.println(pentagonalNumbers);

    }
}
