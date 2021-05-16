package com.chirag.learnJava;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        printVariables();
//        challenge1();
//        challenge2(200);
//        sum3And5Challenge();
        long start;
////        System.out.println("isPalindromeChirag = " + isPalindromeChirag(-1221));
//        System.out.println("isPalindromeChirag = " + isPalindromeChirag(1221));
//        timeTakenToRun(start);
//
//        start = System.nanoTime();
////        System.out.println("isPalindromeChirag = " + isPalindromeChirag(-1221));
//        System.out.println("isPalindromeUdemy = " + isPalindromeUdemy(1221));
//        timeTakenToRun(start);

//
//        start = System.nanoTime();
//        System.out.println(sumFirstAndLastDigit(0));
//        timeTakenToRun(start);

//        start = System.nanoTime();
//        System.out.println(getEvenDigitSum(0));
//        timeTakenToRun(start);
//        start = System.nanoTime();
//        System.out.println(hasSharedDigitChirag(12, 13));
//        timeTakenToRun(start);
//        start = System.nanoTime();
//
//        System.out.println(hasSharedDigitUdemy(12, 13));
//        timeTakenToRun(start);

        double sum = 0;
        int numberOfTimesToRun = 1000;

        for (int i = 0; i < numberOfTimesToRun; i++) {
            System.out.println("");
            start = System.nanoTime();
//            System.out.println(hasSharedDigitChirag(12, 13));
//            System.out.println(hasSharedDigitUdemy(15, 13));
//            System.out.println((hasSameLastDigit(10, 10, 1000)));
//            System.out.println(numberToWords(123));
//            numberToWords(100);
            System.out.println(canPack(1, 1, 11));
            sum += timeTakenToRun(start);
        }
        System.out.println("Average time to run = " + (sum / (double) numberOfTimesToRun) + "ms");


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

    public static boolean isPalindromeUdemy(int inputNumber) {
        int r = 0;
        int sum = 0;
        while (inputNumber > 0) {
            r = inputNumber % 10;  //getting remainder
            sum = (sum * 10) + r;
            inputNumber = inputNumber / 10;
        }
        return inputNumber == sum;
    }

    public static double timeTakenToRun(long start) {
        long stop = System.nanoTime();
        double timeTaken = (double) ((stop - start) / 1e-6d);
        System.out.println("Start = " + start + " | Stop = " + stop + " | Time taken = " + timeTaken + "ms");
        return timeTaken;
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum;
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        if (number < 0) {
            sum = -1;
        }
        else if (number == 0) {
            sum = 0;
        }
        else {
            int numberToDivide = (int) Math.pow(10, count - 1);
            // sum = First Number + Last Number
            sum = (number / numberToDivide) + (number % 10);
        }

        return sum;

    }

    public static int getEvenDigitSum(int number) {
        int remainder;
        int sum = 0;
        if (number < 0) {
            sum = -1;
        }
        else {
            while (number != 0) {
                remainder = number % 10;
                number /= 10;
                if (remainder % 2 == 0) {
                    sum += remainder;
                }
            }
        }
        return sum;

    }

    public static boolean hasSharedDigitChirag(int number1, int number2) {
        boolean isSharedDigit = false;
        int lowerLimit = 10;
        int upperLimit = 99;
        int temp1 = 0, temp2 = 0, temp3 = 0;
        int count1 = 0, count2 = 0;
        if ((number1 >= lowerLimit && number1 <= upperLimit) && (number2 >= lowerLimit && number2 <= upperLimit)) {
            while (number1 != 0) {
                temp1 = number1 % 10;
//                System.out.println("temp1 = " + temp1);
                number1 /= 10;
                temp3 = number2;
                number2 /= 10;

                while (temp3 != 0) {
                    temp2 = temp3 % 10;
                    temp3 /= 10;
//                    System.out.println("temp2 = " + temp2);
                    if (temp1 == temp2) {
                        isSharedDigit = true;
                    }
                }


            }

        }
        else {
            isSharedDigit = false;
        }
        return isSharedDigit;
    }

    public static boolean hasSharedDigitUdemy(int x, int y) {
        boolean isSharedDigit = false;
        int lowerLimit = 10;
        int upperLimit = 99;

        if ((x >= lowerLimit && x <= upperLimit) && (y >= lowerLimit && y <= upperLimit)) {

            // x%10 to extract the second digit
            // x%10 == y%10 compare second digit
            // x%10 == y/10 compare second x digit with first y digit
            // x/10 to extract first digit


            if ((x % 10 == y % 10 || x % 10 == y / 10) || (x / 10 == y % 10 || x / 10 == y / 10)) {
                isSharedDigit = true;
            }

        }
        else {
            isSharedDigit = false;
        }
        return isSharedDigit;
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        boolean isSameLastDigit;
        boolean isWithinLimits = isValid(x) && isValid(y) && isValid(z);

        // Just retain the last digits
        x = x % 10;
        y = y % 10;
        z = z % 10;

        if (!isWithinLimits) {
            isSameLastDigit = false;
        }
        else {
            isSameLastDigit = (x == y || x == z) || (y == z);
        }

        return isSameLastDigit;
    }

    public static boolean isValid(int x) {
        return (x >= 10 && x <= 1000);
    }

    // method to find total number of digits
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static int reverse(int number) {
        int sum = 0;
//        if (number < 0) {
//            sum = -1;
//        }
//        else {
        while (number != 0) {
            sum = 10 * sum + number % 10;
            number /= 10;
        }

//        }
        return sum;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        else if (number < 0) {
            count = -1;
        }
        else {
            while (number != 0) {
                count++;
                number /= 10;
            }
        }


        return count;
    }

    public static void numberToWords(int number) {
        int totalNumberOfDigits = getDigitCount(number);
        int numberInReverse = reverse(number);
        int totalNumberOfDigitsInReverse = getDigitCount(numberInReverse);

        int convertToWord = 0;
//        StringBuilder concatString = new StringBuilder();

        if (number == 0) {
            System.out.println("Zero");
        }
        else if (number < 0) {
            System.out.println("Invalid Value");
        }
        else {
            while (numberInReverse != 0) {
                convertToWord = numberInReverse % 10;
                numberInReverse /= 10;
                String numberInWord = "";
                switch (convertToWord) {
                    case 0:
                        numberInWord = "Zero";
                        break;
                    case 1:
                        numberInWord = "One";
                        break;
                    case 2:
                        numberInWord = "Two";
                        break;
                    case 3:
                        numberInWord = "Three";
                        break;
                    case 4:
                        numberInWord = "Four";
                        break;
                    case 5:
                        numberInWord = "Five";
                        break;
                    case 6:
                        numberInWord = "Six";
                        break;
                    case 7:
                        numberInWord = "Seven";
                        break;
                    case 8:
                        numberInWord = "Eight";
                        break;
                    case 9:
                        numberInWord = "Nine";
                        break;
                    default:
                        numberInWord = "";
                }

//            concatString.append(numberInWord);

                System.out.println(numberInWord);

            }

            if (totalNumberOfDigits != totalNumberOfDigitsInReverse) {
                for (int i = 0; i < (totalNumberOfDigits - totalNumberOfDigitsInReverse); i++) {
                    System.out.println("Zero");
                }
            }
        }


//        return concatString.toString();

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // First check to make sure that the input data is valid
        boolean isPackable = !(bigCount < 0 || smallCount < 0 || goal < 0);

        // Only proceed if we have met the basic condition to package
        if (isPackable) {
            int bigLimit = 5;
            int smallLimit = 3;
            int bigCountRequired = goal / bigLimit;
            int smallCountRequired;

            // Check if we have the required number of bigCount
            if (bigCount >= bigCountRequired) {
                // Calculate how many small counts we actually need
                smallCountRequired = (goal - (bigCountRequired * bigLimit)) / smallLimit;

                // Check if we need to cover the remaining capacity with smallCount
                // We also need to check that the remaining amount can be packaged by smallCount. This is to check for the state when smallLimit is not 1.
                isPackable = (smallCount >= smallCountRequired) && (goal - (bigCountRequired * bigLimit)) % smallLimit == 0;
            }
            else {
                smallCountRequired = (goal - (bigCount * bigLimit)) / smallLimit;

                // Check if we need to cover the remaining capacity with smallCount
                // We also need to check that the remaining amount can be packaged by smallCount. This is to check for the state when smallLimit is not 1.
                isPackable = (smallCount >= smallCountRequired) && (goal - (bigCount * bigLimit)) % smallLimit == 0;
            }

        }
        return isPackable;
    }


}
