package nl.novi.tripledigits;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Variable toevoegen
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        int maximum = 9;
        Random randomiser = new Random();

        firstDigit = randomiser.nextInt(maximum) + 1;
        secondDigit = randomiser.nextInt(maximum) + 1;
        thirdDigit = randomiser.nextInt(maximum) + 1;

//        System.out.println("De waarde van het eeste getal is: " + firstDigit);
//        System.out.println("De waarde van het tweede getal is: " + secondDigit);
//        System.out.println("De waarde van het derde getal is: " + thirdDigit);

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;

        System.out.println("Bereken de 3 getallen die:");
        System.out.println("Een som van: " + sumOfDigits + " hebben.");
        System.out.println("En een product van: " + productOfDigits + " hebben.");

//        Meerdere rondes spelen
        while (true){

        boolean hasPlayerWon = false;
        while (hasPlayerWon == false) {

//        int maxTimesToPlay = 3;
//        for (int index = 0; index < maxTimesToPlay; index ++){
            //        Win Conditie
            System.out.println("*Voer achter elkaar drie getallen in*");

            Scanner userInput = new Scanner(System.in);

            int userChoice1 = userInput.nextInt();
            int userChoice2 = userInput.nextInt();
            int userChoice3 = userInput.nextInt();

            System.out.println("*Je hebt de volgende getallen ingevoerd:*");
            System.out.println("Getal 1: " + userChoice1);
            System.out.println("Getal 2: " + userChoice2);
            System.out.println("Getal 3: " + userChoice3);

            int userChoiceSumOfDigits = userChoice1 + userChoice2 + userChoice3;
            int userChoiceProductOfDigits = userChoice1 + userChoice2 + userChoice3;
            hasPlayerWon = userChoiceSumOfDigits == sumOfDigits && userChoiceProductOfDigits == productOfDigits;

//        boolean hasPlayerWon = userChoice1 == firstDigit || userChoice1 == secondDigit || userChoice1 == thirdDigit && userChoice2 == secondDigit || userChoice2 == firstDigit || userChoice2 == thirdDigit && userChoice3 == thirdDigit || userChoice3 == firstDigit || userChoice3 == secondDigit;

            if (hasPlayerWon) {
                System.out.println("Gefeliciteerd, je hebt gewonnen!");
            } else {
                System.out.println("Helaas, je hebt verloren...");
            }
//        Menu toevoegen
            Scanner userInputContinue = new Scanner(System.in);
            boolean continuePlaying = true;

            System.out.println("Wil je het nogmaals proberen? y/n");
            String continuePlayingUserChoice = userInputContinue.nextLine();
            switch (continuePlayingUserChoice) {
                case "y": {
                    System.out.println("Je hebt ervoor gekozen om normaals te spelen");
                    continuePlaying = true;
                    break;
                }
                case "n": {
                    System.out.println("Je hebt ervoor gekozen om te stoppen");
                    continuePlaying = false;
                    break;
                }
                default: {
                    System.out.println("Je hebt geen geldige waarde ingevoerd");
                    break;
                }
            }
            if (continuePlaying == false) {
                break;
            }
        }
            System.out.println("Het spel is afgelopen");
        }
    }
}
