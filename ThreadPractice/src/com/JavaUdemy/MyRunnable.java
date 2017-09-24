package com.JavaUdemy;
import static com.JavaUdemy.ThreadColor.ANSI_GREEN;
/**
 * Created by Harmandeep on 24-09-2017.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Hello from the MyRunnable Thread");
    }
}
