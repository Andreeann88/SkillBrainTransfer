package org.example.oop.overloading.addition;

import org.example.oop.overloading.addition.Adder;

public class MainAdd {
    public static void main(String[] args) {
        Adder adder = new Adder();

        int result = adder.add(9,7, 8);
        System.out.println("Suma este: " + result);

       String resultString = adder.add("6", "10");
       System.out.println("Suma este: " + resultString);

       double resultPrase = adder.add("10",5.2);
        System.out.println("Suma este: " + resultPrase);

    }
}
