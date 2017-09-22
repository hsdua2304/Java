package com.JavaUdemy;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(2,false);
        printer.printPage();
        printer.printPage();
        //System.out.println("Toner Level : " + printer.getTonerLevel());
        printer.printPage();
        printer.printPage();
        printer.printPage();
        //printer.fillToner(30);
        printer.printPage();
        printer.printPage();
        System.out.println("Number Of Pages : " + printer.getNumOfPage());
    }
}
