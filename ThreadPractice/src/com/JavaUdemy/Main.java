package com.JavaUdemy;
import static com.JavaUdemy.ThreadColor.*;
public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"Hello from the Main Thread!!");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_CYAN+"Hello from the AnonymousClass Thread!!");
            }
        }.start();

        Thread threadMyRunnable = new Thread(new MyRunnable(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from the AnonymousClass of MyRunnable Class!!");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_GREEN+"AnotherThread is interupted,So I am Running from Anonymous Runnable");
                }catch (InterruptedException e){
                    System.out.println(ANSI_GREEN+"Anonymous Runnable is Interrupted");
                }
            }
        });

        threadMyRunnable.start();
//        anotherThread.interrupt();
        System.out.println(ANSI_BLUE+"Hello from the Main Thread again!!");


    }
}
