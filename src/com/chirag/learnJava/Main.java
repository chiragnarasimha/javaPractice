package com.chirag.learnJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printVariables();
        challenge1();

    }

    public static void printVariables() {
        int myValue = 1000;
        String color = "#FFFFF";
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
    }

    public static void challenge1() {
        byte byteNum = 100;
//        System.out.println(byteNum);
        short shortNum = Short.MAX_VALUE - 100;
//        System.out.println(shortNum);
        int intNum = 50000;
        long longNum = intNum + 10*(byteNum+shortNum);
        System.out.println("longNum = " + longNum);

    }
}
