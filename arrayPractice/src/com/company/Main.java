package com.company;
import java.util.Random;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class Main {
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

        long start1 = System.currentTimeMillis();
        randomNumbers(userInputNum, numbers);
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        populateArray(numbers);
        long end2 = System.currentTimeMillis();

        System.out.println("Elapsed time to create array with random numbers: " + (end1 - start1) + " miliseconds");
        System.out.println("Elapsed time to populate the array: " + (end2 - start2) + " miliseconds");
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
            System.out.println(i + "         " + arrayToPopulate[i]);
        }
    }
}
