package com.JavaUdemy;

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
	    new Thread1().start();
	    new Thread2().start();
    }

    private static class Thread1 extends Thread{

        public void run(){
            synchronized (lock1){
                System.out.println("Thread-1 ->Holding-> lock1");
                try{
                    currentThread().sleep(200);
                }catch (InterruptedException e){

                }
                System.out.println("Thread-1 ->Waiting-> lock2");
                synchronized (lock2){
                    System.out.println("Thread-1 ->Holding-> lock1 and lock2");
                }
                System.out.println("Thread-1 ->Released-> lock2");
            }
            System.out.println("Thread-1 ->Released-> lock1");
        }
    }

    private static class Thread2 extends Thread{
        public void run(){
            synchronized (lock2){
                System.out.println("Thread-2 ->Holding-> lock2");
                try{
                    Thread.sleep(200);
                }catch(InterruptedException e) {

                }
                System.out.println("Thread-2 ->Waiting-> lock1");
                synchronized (lock1){
                    System.out.println("Thread-2 ->Holding-> lock1 and lock2");
                }
                System.out.println("Thread-2 ->Released-> lock1");
            }
            System.out.println("Thread-2 ->Released-> lock2");
        }

    }
}
