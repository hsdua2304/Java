package com.JavaUdemy;
import static com.JavaUdemy.ThreadColor.ANSI_PURPLE;
import static com.JavaUdemy.ThreadColor.ANSI_RED;
import static com.JavaUdemy.ThreadColor.ANSI_BLUE;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"This is main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();
//        anotherThread.run();
//        We create a anonymous class for the thread

        new Thread(){
            public void run(){
                System.out.println(ANSI_BLUE+"Hello from the anonymous class");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            public void run(){
                System.out.println(ANSI_PURPLE+"Hello from the anonymous class of runnable thread ");
                try{
                    anotherThread.join();
                    System.out.println(ANSI_PURPLE+"AnotherThread Terminated, So I am running again");
                }catch (InterruptedException e){
                    System.out.println(ANSI_PURPLE+"I am runnable!!.. I have been interrupted");
                    return;
                }
            }

        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_RED+"Hello again from the main thread");
    }
}
