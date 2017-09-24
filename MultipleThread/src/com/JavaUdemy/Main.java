package com.JavaUdemy;

public class Main {

    public static void main(String[] args) {

        CountDown countDown = new CountDown();
        ThreadCountDown t1 = new ThreadCountDown(countDown);
        t1.setName("Thread 1");
        ThreadCountDown t2 = new ThreadCountDown(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class CountDown{
    private int i;
    public void doCountDown(){
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_GREEN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_CYAN;
                break;
            default:
                color = ThreadColor.ANSI_RED;
        }
        synchronized (this){
            for(i = 1; i <=10 ; i++){
                System.out.println(color + Thread.currentThread().getName() + " i = " + i);
            }
        }

    }
}
class ThreadCountDown extends Thread{
    private CountDown threadCountDown;

    public ThreadCountDown(CountDown countDown){
        threadCountDown = countDown;
    }
    public void run(){
        threadCountDown.doCountDown();
    }
}
