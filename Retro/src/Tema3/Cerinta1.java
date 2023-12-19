package Tema3;
import java.util.Scanner;
public class Cerinta1 {
    public static void cerinta() {
        int[] array = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("Suma elementelor din array este: " + suma);
    }

    public static void cerinta2() {
        String caractere = "Hello World!";
        int lungimeSir = caractere.length();
        System.out.println("Lungimea sirului este:" + lungimeSir);

    }

    public static void cerinta3() {
        int[] numere = {2, 4, 6, 8, 10};
        System.out.println("Arrayul initial este: ");
        for (int i = 0; i < numere.length; i++) {
            System.out.println(numere[i] + "");
        }
        System.out.println("Arrayul dupa multiplicare cu 2: ");
        for (int i = 0; i < numere.length; i++) {
            numere[i] = numere[i] * 2;
            System.out.print(numere[i] + " ");
        }
    }

    public static void cerinta4() {
        int number = 2;
        System.out.println("Numere pare între 1 și 20:");
        while (number <= 20) {
            System.out.println(number);
            number += 2;
        }
    }

    public static void cerinta5() {
        Scanner citire = new Scanner(System.in);
        System.out.print("Introduceți un număr întreg: ");
        int numar = citire.nextInt();
        citire.close();

        if (numar % 2 == 0) {
            System.out.println("Numărul introdus este par.");
        } else {
            System.out.println("Numărul introdus este impar.");
        }
    }

    public static void cerinta6() {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7};
        int sumaElem = 0;
        for (int i = 0; i < arrays.length; i++) {
            sumaElem += arrays[i];
        }
        int media = (int) sumaElem / arrays.length;

        System.out.println("Suma elementelor din array este: " + sumaElem);
        System.out.println("Media elementelor din array este: " + media);

    }

    public static void cerinta7() {
        String sir = "Cursul Java a inceput in luna Octombrie";
        Scanner citire2 = new Scanner(System.in);
        System.out.print("Introduceți un caracter: ");
        char caracterCautat = citire2.next().charAt(0);
        citire2.close();

        boolean caracterExista = false;
        for (int i = 0; i < sir.length(); i++) {
            if (sir.charAt(i) == caracterCautat) {
                caracterExista = true;
                break;
            }
        }

        if (caracterExista) {
            System.out.println("Caracterul există în șir.");
        } else {
            System.out.println("Caracterul nu există în șir.");
        }
    }

    public static void cerinta8() {

    }

    public static void cerinta9() {
        char[] arrayCaractere = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Elemente în ordine inversă:");
        for (int i = arrayCaractere.length - 1; i >= 0; i--) {
            System.out.print(arrayCaractere[i] + " ");
        }
    }

    public static void cerinta10() {
        Scanner citit = new Scanner(System.in);
        System.out.print("Introduceți un număr întreg: ");
        int num = citit.nextInt();

        if (num < 0) {
            System.out.println("Numărul se află în intervalul negativ.");
        } else if (num == 0) {
            System.out.println("Numărul este zero.");
        } else if (num > 0 && num <= 10) {
            System.out.println("Numărul se află în intervalul 1-10.");
        } else if (num > 10 && num <= 100) {
            System.out.println("Numărul se află în intervalul 11-100.");
        } else {
            System.out.println("Numărul este mai mare decât 100.");
        }
        citit.close();
    }

    public static void cerinta11() {
        int [] arrayNumere={2,4,6,8};
        int max = 0;
        int min = 0;
        for (int i = 1; i < arrayNumere.length; i++) {
            if (arrayNumere[i] > max) {
                max = arrayNumere[i];
            } else if (arrayNumere[i] < min) {
                min = arrayNumere[i];
            }
        }
        System.out.println("Elementul maxim din array este: " + max);
        System.out.println("Elementul minim din array este: " + min);
    }

    public static void cerinta12() {
        String primulSir = "La multi ani, ";
        String aldoileaSir ="Romania!";
        String concatenare = primulSir.concat(aldoileaSir);
        System.out.println("Concatenarea celor 2 siruri este: " + concatenare);
    }

    public static void cerinta13() {

    }

    public static void cerinta14() {
        int n = 10;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Primele 10 numere din șirul Fibonacci sunt:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}






