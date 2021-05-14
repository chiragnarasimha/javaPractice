package com.chirag.learnJava;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        printVariables();
//        challenge1();
//        challenge2(200);
//        sum3And5Challenge();
        long start = System.nanoTime();
//        System.out.println("isPalindromeChirag = " + isPalindromeChirag(-1221));
        System.out.println("isPalindromeChirag = " + isPalindromeChirag(1221));
        timeTakenToRun(start);

        start = System.nanoTime();
//        System.out.println("isPalindromeChirag = " + isPalindromeChirag(-1221));
        System.out.println("isPalindromeUdemy = " + isPalindromeUdemy(1221));
        timeTakenToRun(start);


    }

    public static void printVariables() {
        System.out.println("From printVariables()");
        int myValue = 1000;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int myValueTest = 2_147_483_647;
        System.out.println(myValueTest);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        long testLong = 2_147_483_647_123L;
        System.out.println(testLong);

        int minInt = Integer.MIN_VALUE + 100 / 2;
        byte testByteValue = (byte) (minInt / 2);
        System.out.println("byte = " + testByteValue);

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        System.out.println("maxFloat = " + maxFloat + " | minFloat = " + minFloat);
        System.out.println("Add String to Int = " + (Integer.valueOf("20") + 10));

        boolean isCar = true;
        if (!isCar) {
            System.out.println("The item is not a car");
        }

        // The same thing can be accomplished using ternary operators
        String wasCar = isCar ? "Yes, it was a car" : "No, it wasnt a car";
        System.out.println(wasCar);
    }

    public static void challenge1() {
        byte byteNum = 100;
//        System.out.println(byteNum);
        short shortNum = Short.MAX_VALUE - 100;
//        System.out.println(shortNum);
        int intNum = 50000;
        long longNum = (long) (intNum + 10 * (byteNum + shortNum));
        System.out.println("longNum = " + longNum);

        char myChar = 'D';
        char myCharUnicode = '\u0044';
        System.out.println("");
        System.out.println("Challenge 1:  " + "myChar = " + myChar + " | myCharUnicode = " + myCharUnicode);
    }

    /**
     * ## Description     :
     * Challenge 2: Convert pounds to kilograms.
     *
     * <p>
     * ### Inputs : poundsInput
     * 1. poundsInput - number in grams
     *
     * <p>
     * <table border="1" cellpadding="5px" style="text-align:center">
     * | Date          | Author                   | Modification  |
     * |:-------------:|:------------------------:|:-------------:|
     * | 13 May 2021  | Chirag Narasimha Murthy  | Created       |
     * </table>
     */
    public static void challenge2(int poundsInput) {
        System.out.println("");
        System.out.println("Challenge 2:  " + poundsInput + "g in Kg = " + (double) poundsInput * 0.45359237d + "Kg");
    }

    public static void sum3And5Challenge() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("This is from the sum3And5Challenge()");

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                System.out.println("Can be divided by both 3 and 5 ->> " + i + " | Sum = " + sum);
                count++;
            }
            if (count == 5) {
                System.out.println("We found 5 numbers already");
                break;
            }

        }

    }

    public static boolean isPalindromeChirag(Integer inputNumber) {
        inputNumber = (Math.abs(inputNumber));
        String inputNumberString = inputNumber.toString();
        char[] inputNumberStringArray = inputNumberString.toCharArray();
        String reverseNumberString = new String();
        for (int i = inputNumberStringArray.length - 1; i >= 0; i--) {
            reverseNumberString += inputNumberStringArray[i];
        }
        return reverseNumberString.equals(inputNumberString);

    }

    public static boolean isPalindromeUdemy(int inputNumber){
        int r = 0;
        int sum = 0;
        while(inputNumber>0){
            r=inputNumber%10;  //getting remainder
            sum=(sum*10)+r;
            inputNumber=inputNumber/10;
        }
        return inputNumber == sum;


    }

    public static void timeTakenToRun(long start) {
        long stop = System.nanoTime();
        System.out.println("Start = " + start + " | Stop = " + stop + " | Time taken = " + (double) ((stop - start) / 1e-6d) + "ms");
    }


}
