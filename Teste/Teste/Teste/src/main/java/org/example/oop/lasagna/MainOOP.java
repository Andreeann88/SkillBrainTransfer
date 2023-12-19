package org.example.oop.lasagna;

import org.example.oop.lasagna.Lasagna;

public class MainOOP {
    public static void main(String[] args) {



    /* Lasagna obiect = new Lasagna();
     obiect.printNestatic();

     Lasagna.printStatic();
     obiect.name = " Prima noastra Lasagna";

     Lasagna bolognese = new Lasagna();
     bolognese.name = "Paste";
     System.out.println(bolognese.name);
     System.out.println(obiect.name);

     */
    Lasagna lasagna = new Lasagna();

        int expectedOvenTime = lasagna.expectedMinutesInOven();
        System.out.println("Expected oven time: " + expectedOvenTime + " minutes");


        int remainingOvenTime = lasagna.remainingMinutesInOven(30);
        System.out.println("Remaining oven time: " + remainingOvenTime + " minutes");


        int preparationTime = lasagna.preparationTimeInMinutes(2);
        System.out.println("Preparation time: " + preparationTime + " minutes");


        int totalTime = lasagna.totalTimeInMinutes(3, 20);
        System.out.println("Total working time: " + totalTime + " minutes");



}

}





