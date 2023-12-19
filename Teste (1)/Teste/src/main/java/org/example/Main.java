package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isCharacterPresent(String sir, char caracterCautat) {
        boolean caracterExista = false;
        for (int i = 0; i < sir.length(); i++) {
            if (sir.charAt(i) == caracterCautat) {
                caracterExista = true;
                break;
            }
        }
        return caracterExista;
    }

    public static boolean isPrime(int nr){
        return false;
    }
}