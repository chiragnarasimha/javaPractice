package com.chirag.learnJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printVariables();
        challenge1();
        challenge2(5000);

    }

    public static void printVariables() {
        int myValue = 1000;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int myValueTest = 2_147_483_647;
        System.out.println(myValueTest);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        long testLong = 2_147_483_647_123L;
        System.out.println(testLong);

        int minInt = Integer.MIN_VALUE+100/2;
        byte testByteValue = (byte)(minInt/2);
        System.out.println("byte = "+testByteValue);

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        System.out.println("maxFloat = " + maxFloat + " | minFloat = " +minFloat );
    }

    public static void challenge1() {
        byte byteNum = 100;
//        System.out.println(byteNum);
        short shortNum = Short.MAX_VALUE - 100;
//        System.out.println(shortNum);
        int intNum = 50000;
        long longNum = (long)(intNum + 10*(byteNum+shortNum));
        System.out.println("longNum = " + longNum);

    }

    /**
     * ## Description     :
     * Challenge 2: Convert pounds to kilograms.
     *
     * <p>
     * ### Inputs : poundsInput
     *    1. poundsInput - number in grams
     *
     * <p>
     * <table border="1" cellpadding="5px" style="text-align:center">
     * | Date          | Author                   | Modification  |
     * |:-------------:|:------------------------:|:-------------:|
     * | 13 May 2021  | Chirag Narasimha Murthy  | Created       |
     * </table>
     */
    public static void challenge2(int poundsInput){
        System.out.println(poundsInput + "g in Kg = " +  (double)poundsInput * 0.45359237 + "Kg");
    }
}
