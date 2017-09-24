package com.JavaUdemy;
import static com.JavaUdemy.ThreadColor.ANSI_RED;
/**
 * Created by Harmandeep on 24-09-2017.
 */
public class AnotherThread extends Thread{
    public void run(){
        System.out.println(ANSI_RED+"Hello from the AnotherThread class!!");
        try{
            sleep(5000);
        }catch (InterruptedException e){
            System.out.println(ANSI_RED+"Another Thread is been interrupted");
            return;
        }
        System.out.println(ANSI_RED+"AnotherThread is wake up after 5 seconds");
    }
}
