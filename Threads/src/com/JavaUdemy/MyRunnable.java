package com.JavaUdemy;
import static com.JavaUdemy.ThreadColor.ANSI_PURPLE;
/**
 * Created by Harmandeep on 23-09-2017.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE+"Hello fro the Runnable method");
    }
}
