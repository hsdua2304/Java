package com.JavaUdemy;

/**
 * Created by Harmandeep on 13-05-2017.
 */
public class Printer {
    private int tonerLevel;
    private int numOfPage = 0;
    boolean duplexPrinter;
    private int pages;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        if(this.tonerLevel <= 20){
            System.out.println("Please refil the toner");
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int val){
        if(this.tonerLevel + val <= 100){
            this.tonerLevel += val;
            System.out.println("Toner Refiled to : " + this.tonerLevel);
        }
        else{
            System.out.println("You are exceeding the Limit!!!!");
        }
    }

    public void printPage(){
        if(getTonerLevel() <= 0){
            System.out.println("Cannot Print!!! Please Refil the Toner");
        }
        else {
            this.pages++;
            this.numOfPage++;
            System.out.println("Total Number of Pages printed : " + getNumOfPage());
            if (this.pages >= 2) {
                this.tonerLevel--;
                this.pages = 0;
            }
            if (getTonerLevel() < 20) {
                System.out.println("Please refil toner it reach at level : " + getTonerLevel());
            }
        }
    }


    public int getPages(){
        return pages;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
