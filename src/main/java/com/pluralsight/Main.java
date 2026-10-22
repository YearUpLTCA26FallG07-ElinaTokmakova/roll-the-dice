package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {

            int roll1 = dice.roll();
            int roll2 = dice.roll();
            int sum = roll1 + roll2;

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }

            System.out.println("Roll " + i + ":    " + roll1 + " - " + roll2 + "   Sum:  " + sum);
        }

        System.out.println("\nCounter for 2 sum: " + twoCounter);
        System.out.println("Counter for 4 sum: " + fourCounter);
        System.out.println("Counter for 6 sum: " + sixCounter);
        System.out.println("Counter for 7 sum: " + sevenCounter);

    }
}
