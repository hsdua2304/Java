package com.JavaUdemy;

/**
 * Created by Harmandeep on 23-09-2017.
 */

import static com.JavaUdemy.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Hello from the " + currentThread().getName());

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(ANSI_GREEN+ "Someone wakes me up!!!!!!!");
            return;
        }

        System.out.println(ANSI_GREEN + "5 seconds have passed to sleep " + currentThread().getName());
    }
}
