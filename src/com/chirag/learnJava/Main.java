package com.chirag.learnJava;

import com.chirag.learnJava.OOPChallenges.Account;

public class Main {

    public static void main(String[] args) {

        long start;

        double sum = 0;
        int numberOfTimesToRun = 1;

        /* Run Code with execution metrics */

/*        for (int i = 0; i < numberOfTimesToRun; i++) {
           System.out.println("");
           start = System.nanoTime();

           sum += timeTakenToRun(start);
       }
       System.out.println("Average time to run = " + (sum / (double) numberOfTimesToRun) + "ms");
*/
        Account bobsAccount = new Account("Bob Salmon", "Bob.Salmon@gmail.com", 123123, 0404040404, 100);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositAmount(100);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(70);
        bobsAccount.withdrawFunds(20);


    }

}
