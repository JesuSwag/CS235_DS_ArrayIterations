package com.company;
import java.util.Random;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        int userInputNum = 0;

        System.out.println("Size of array?");
        userInput = input.nextLine();

        //-- Changes user input from string to int --//
        try {
            userInputNum = Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("Number was not provided");
        }

        int[] numbers = new int[userInputNum];
        System.out.println("");

        randomNumbers(userInputNum, numbers);
        populateArray(numbers);
    }

    //-- gen numbers and store to array
    //-- Note: If arraySize passed != the actual size of array, an exception will be thrown.
    public static void randomNumbers(int arraySize, int[] arrayToStone){
        Random numberGenerator = new Random();
        int randomNum = 0;

        for (int i = 0; i <= arraySize - 1; i++){
            randomNum = numberGenerator.nextInt(100);
            arrayToStone[i] = randomNum;
        }
    }

    public static void populateArray(int[] arrayToPopulate){
        System.out.println("Index # | Number Stored");
        for (int i = 0; i <= arrayToPopulate.length - 1; i++){
            System.out.println((i + 1) + "         " + arrayToPopulate[i]);
        }
    }
}
